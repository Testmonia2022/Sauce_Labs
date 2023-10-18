package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AlertPage {
	private ConfigFileReader configFileReader;
	/* @FindBy */
	@FindBy(how = How.ID, using = "alertButton")
	public static WebElement alertBtn;
	@FindBy(how = How.ID, using = "timerAlertButton")
	public static WebElement timerAlertBtn;
	@FindBy(how = How.ID, using = "confirmButton")
	public static WebElement confirmBtn;
	@FindBy(how = How.ID, using = "confirmResult")
	public static WebElement confirmRst;
	@FindBy(how = How.ID, using = "promtButton")
	public static WebElement promtBtn;
	@FindBy(how = How.ID, using = "promptResult")
	public static WebElement promptRst;

	public AlertPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Methods */
	public void login() {
		Setup.driver.get(configFileReader.getProperties("demoqa.url"));

	}

	public void clickOnAlertBtn() {
		alertBtn.click();
	}

	public void clickOnTimerAlertBtn() {
		timerAlertBtn.click();

	}

	public void clickOnconfirmBtn() {
		confirmBtn.click();
	}

	public void clickOnPromtBtn() {
		promtBtn.click();
	}
}
