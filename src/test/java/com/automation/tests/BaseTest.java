package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;

public class BaseTest {

	LoginPage loginPage;
	HomePage homePage;
	CartPage cartPage;

	@BeforeMethod
	public void setUp() {
		ConfigReader.initProperties();
		DriverUtils.createDriver();
		loginPage = new LoginPage();
		homePage = new HomePage();
		cartPage = new CartPage();
	}

	@AfterMethod
	public void cleanUp() {
		DriverUtils.closeDriver();
	}
}
