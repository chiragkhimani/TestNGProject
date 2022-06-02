package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;

public class LoginPage {

	@FindBy(id = "user-name")
	WebElement userNameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(DriverUtils.driver, this);
	}

	public void doLogin() {
		userNameInput.sendKeys(ConfigReader.getProperty("user.name"));
		passwordInput.sendKeys(ConfigReader.getProperty("user.password"));
		loginBtn.click();
	}

	public void openWebsite() {
		DriverUtils.driver.get(ConfigReader.getProperty("app.url"));
	}

}
