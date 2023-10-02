package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginOutlineStepDefinition {
	private LoginPage loginPage;

	public LoginOutlineStepDefinition() {
		this.loginPage = new LoginPage();
	}

	@Given("Je me connecte sur l application swag Labs")
	public void jeMeConnecteSurLApplicationSwagLabs() {
		loginPage.connectToApp();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		loginPage.fillUsername(name);
	}

	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		loginPage.fillPassword(password);
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickBtnLogin();
	}

}
