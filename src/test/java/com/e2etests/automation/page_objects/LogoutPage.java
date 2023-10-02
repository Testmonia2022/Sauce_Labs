package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class LogoutPage {

	/* @FindBy */
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logoutBtn;

	public LogoutPage() {
		PageFactory.initElements(Setup.driver, this);

	}

	/* Create Methods */
	public void clickLogoutBtn() {
		logoutBtn.click();

	}
}
