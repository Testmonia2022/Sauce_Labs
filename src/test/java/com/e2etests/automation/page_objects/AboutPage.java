package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AboutPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement burgerMenu;
	@FindBy(how = How.ID, using = "about_sidebar_link")
	public static WebElement aboutbtn;
	@FindBy(how = How.XPATH, using = "//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Resources']")
	public static WebElement resourcesMenu;

	public AboutPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Methods */
	public void clickBurgerMenu() {
		burgerMenu.click();
	}

	public void clickAboutBtn() {
		aboutbtn.click();
	}
}
