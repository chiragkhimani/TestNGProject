package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.utils.ConfigReader;

public class CartTest extends BaseTest {

	@Test(groups = "chirag")
	public void verifyItemDetailsOnCart() {
		loginPage.openWebsite();
		loginPage.doLogin(ConfigReader.getProperty("user.name"), ConfigReader.getProperty("user.password"));
		homePage.verifyHomePage();
		homePage.getFirstItemDetails();
		homePage.clickOnAddToCartBtnOfFirstItem();
		homePage.clickOnCartIcon();
		cartPage.verifyCartPage();
		cartPage.verifyItemDetails();
	}
}
