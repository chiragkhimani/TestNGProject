package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.DriverUtils;

public abstract class BasePage {
	WebDriver driver;

	public BasePage() {
		driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}
}
