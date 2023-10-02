package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {

	private LoginPage loginPage;

	public LoginStepDefinition() {
		this.loginPage = new LoginPage();
	}

	@Given("Je me connecte a l application Swag Labs")
	public void jeMeConnecteALApplicationSwagLabs() {
		loginPage.login();

	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String textLoginPass) {
		String messageProducts = loginPage.titleProducts.getText();

		Assert.assertEquals(messageProducts, textLoginPass);
	}

	@Given("Je me connecte a l application Swag Labs avec coordonnees non correct")
	public void jeMeConnecteALApplicationSwagLabsAvecCoordonneesNonCorrect() {
		loginPage.loginNP();
	}

	@Then("Le message d erreur s affiche {string}")
	public void leMessageDErreurSAffiche(String textLoginFail) {
		String errorMsg = LoginPage.msgError.getText();
		Assert.assertEquals(errorMsg, textLoginFail);

	}

}
