package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.utils.ConfigReader;

public class LoginTest extends BaseTest {

	@Test(groups = "preeti")
	public void verifyUserCanLogin() {
		loginPage.openWebsite();
		loginPage.doLogin(ConfigReader.getProperty("user.name"), ConfigReader.getProperty("user.password"));
		homePage.verifyHomePage();
	}

	@Test(groups = "chirag")
	public void verifyUserCannotLoginWithInvalidCredentials() {
		loginPage.openWebsite();
		loginPage.doLogin("invalidUsername", "admin123");
		loginPage.verifyInvalidLoginErrorMsg();
	}

}
