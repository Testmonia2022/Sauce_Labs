package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AboutPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutStepDefinition {
	private AboutPage aboutPage;

	public AboutStepDefinition() {
		this.aboutPage = new AboutPage();
	}

	@When("Je clique le menu burger")
	public void jeCliqueLeMenuBurger() {
		aboutPage.clickBurgerMenu();
	}

	@When("Je clique sur about")
	public void jeCliqueSurAbout() {
		aboutPage.clickAboutBtn();

	}

	@Then("Je me redirige vers la page about {string}")
	public void jeMeRedirigeVersLaPageAbout(String resourcesText) {
		String resourcesMenu = AboutPage.resourcesMenu.getText();
		Assert.assertEquals(resourcesMenu, resourcesText);

	}

}
