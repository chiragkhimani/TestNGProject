package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.utils.ConfigReader;

public class LoginPage extends BasePage {

	@FindBy(id = "user-name")
	WebElement userNameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement invalidLoginErrorMsg;

	public void doLogin(String username, String password) {
		userNameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

	public void openWebsite() {
		driver.get(ConfigReader.getProperty("app.url"));
	}

	public void verifyInvalidLoginErrorMsg() {
		Assert.assertTrue(invalidLoginErrorMsg.isDisplayed(), "Invalid login error msg missing from login page");
	}

}
