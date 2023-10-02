package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement userName;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement loginBtn;
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement titleProducts;
	@FindBy(how = How.XPATH, using = "//h3[@data-test='error']")
	public static WebElement msgError;

	public LoginPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Methods */
	public void login() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
		userName.clear();
		userName.sendKeys(configFileReader.getProperties("home.username"));
		password.clear();
		password.sendKeys(configFileReader.getProperties("home.password"));
		loginBtn.click();
	}

	public void loginNP() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
		userName.clear();
		userName.sendKeys(configFileReader.getProperties("home.username.nonCorrect"));
		password.clear();
		password.sendKeys(configFileReader.getProperties("home.password.nonCorrect"));
		loginBtn.click();

	}

	public void connectToApp() {
		Setup.driver.get(configFileReader.getProperties("home.url"));

	}

	public void fillUsername(String name) {
		userName.clear();
		userName.sendKeys(name);
	}

	public void fillPassword(String passwordValue) {
		password.clear();
		password.sendKeys(passwordValue);
	}

	public void clickBtnLogin() {
		loginBtn.click();
	}
}
