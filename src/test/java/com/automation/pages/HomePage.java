package com.automation.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {

	static Map<String, String> dataOnPage = new HashMap<String, String>();

	@FindBy(className = "header_secondary_container")
	WebElement pageTitle;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addToCartBtnFirstItem;

	@FindBy(xpath = "//a[@id='item_4_title_link']/div")
	WebElement itemName;

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	List<WebElement> itemPriceList;

	@FindBy(css = ".shopping_cart_link")
	WebElement cartIcon;

	public void verifyHomePage() {
		Assert.assertTrue(pageTitle.isDisplayed(), "Home page is not loaded");
	}

	public void getFirstItemDetails() {
		dataOnPage.put("itemName", itemName.getText());
		dataOnPage.put("itemPrice", itemPriceList.get(0).getText());
	}

	public void clickOnAddToCartBtnOfFirstItem() {
		addToCartBtnFirstItem.click();
	}

	public void clickOnCartIcon() {
		cartIcon.click();
	}
}
