package com.automation.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage {
	@FindBy(css = ".inventory_item_name")
	WebElement itemName;

	@FindBy(css = ".inventory_item_price")
	WebElement itemPrice;

	@FindBy(css = ".header_secondary_container")
	WebElement pageTitle;

	public void verifyCartPage() {
		Assert.assertTrue(pageTitle.isDisplayed(), "Cart page is not loaded");
	}

	public void verifyItemDetails() {
		Map<String, String> dataOnCartPage = new HashMap<String, String>();
		dataOnCartPage.put("itemName", itemName.getText());
		dataOnCartPage.put("itemPrice", itemPrice.getText());
		System.out.println("Homepage data : " + HomePage.dataOnPage);
		System.out.println("cartpage data : " + dataOnCartPage);
		Assert.assertTrue(HomePage.dataOnPage.equals(dataOnCartPage),
				"Item details on cart page is not same as on home page");
	}
}
