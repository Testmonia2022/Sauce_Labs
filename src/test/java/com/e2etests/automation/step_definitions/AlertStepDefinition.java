package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import com.e2etests.automation.page_objects.AlertPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertStepDefinition {

	private AlertPage alertPage;

	public AlertStepDefinition() {
		this.alertPage = new AlertPage();
	}
	
	/*
	 * Click Button to see alert
	 */

	@Given("Je me connecte sur l application demoqa")
	public void jeMeConnecteSurLApplicationDemoqa() {
		alertPage.login();
	}

	@When("Je click sur le bouton alertButton")
	public void jeClickSurLeBoutonAlertButton() {
		alertPage.clickOnAlertBtn();
	}

	@Then("l alerte se declenche {string}")
	public void lAlerteSeDeclenche(String textAlert) {
		// Setup.driver.switchTo().alert().accept();
		Alert alert = Setup.driver.switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals(alertText, textAlert);
		
		alert.accept();
	}

	/*
	 * On button click, alert will appear after 5 seconds
	 */
	
	@When("Je click sur le bouton timerAlertButton")
	public void jeClickSurLeBoutonTimerAlertButton() {
	 alertPage.clickOnTimerAlertBtn();
	}
	@Then("l alerte se declenche apres cinque secondes {string}")
	public void lAlerteSeDeclencheApresCinqueSecondes(String textTimerAlert) throws InterruptedException {
		Thread.sleep(5000);
		Alert timerAlert = Setup.driver.switchTo().alert();
		String timerAlertText = timerAlert.getText();
		Assert.assertEquals(timerAlertText, textTimerAlert);
		
		timerAlert.accept();
	}
	
	/*
	 * On button click, confirm box will appear
	 */

	@When("Je click sur le bouton confirmAlertButton")
	public void jeClickSurLeBoutonConfirmAlertButton() {
		alertPage.clickOnconfirmBtn();
	}
	@When("Je click sur le bouton ok")
	public void jeClickSurLeBoutonOk() {
	   Setup.driver.switchTo().alert().accept();
	}
	@Then("le message {string} s affiche")
	public void leMessageSAffiche(String textALertConfirm) {
	String   alertConfirmRslt =AlertPage.confirmRst.getText();
	Assert.assertTrue(alertConfirmRslt.contains(textALertConfirm));
	}
	
	/*
	 * On button click, prompt box will appear
	 */

	@When("Je click sur le bouton promptAlertButton")
	public void jeClickSurLeBoutonPromptAlertButton() {
		((JavascriptExecutor) Setup.driver).executeScript("window.scrollBy(0,500)", "");

		alertPage.clickOnPromtBtn();
	}
	@When("Je saisie le nom {string}")
	public void jeSaisieLeNom(String text) {
	  Setup.driver.switchTo().alert().sendKeys(text);
	}
	@When("Je clique sur le bouton ok")
	public void jeCliqueSurLeBoutonOk() {
		Setup.driver.switchTo().alert().accept();
	}
	

	@Then("le message suivant {string} s affiche")
	public void leMessageSuivantSAffiche(String textPrompt) {
		String   alertpromptRslt =AlertPage.promptRst.getText();
		Assert.assertTrue(alertpromptRslt.contains(textPrompt));
	}











}
