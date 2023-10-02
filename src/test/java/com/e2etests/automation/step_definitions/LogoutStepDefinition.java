package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LogoutPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	private LogoutPage logoutPage;

	public LogoutStepDefinition() {
		this.logoutPage = new LogoutPage();
	}

	@When("Je clique sur logout")
	public void jeCliqueSurLogout() {
		logoutPage.clickLogoutBtn();

	}

	@Then("Je me redirige vers la page de connexion {string}")
	public void jeMeRedirigeVersLaPageDeConnexion(String logoutUrl) {
		String actualURL = Setup.driver.getCurrentUrl();
		Assert.assertEquals(actualURL, logoutUrl);

	}

}
