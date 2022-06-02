package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utils.DriverUtils;

public class HomePage {
	@FindBy(className = "header_secondary_container")
	WebElement pageTitle;
	
	public HomePage(){
		PageFactory.initElements(DriverUtils.driver, this);
	}

	public void verifyHomePage() {
		Assert.assertTrue(pageTitle.isDisplayed(), "Home page is not loaded");
	}
}
