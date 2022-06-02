package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;

public class LoginTest {

	@BeforeMethod
	public void setUp() {
		ConfigReader.initProperties();
		DriverUtils.createDriver();
	}

	@Test
	public void verifyUserCanLogin() {
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();

		loginPage.openWebsite();
		loginPage.doLogin();
		homePage.verifyHomePage();
	}

	@AfterMethod
	public void cleanUp() {
		DriverUtils.closeDriver();
	}
}
