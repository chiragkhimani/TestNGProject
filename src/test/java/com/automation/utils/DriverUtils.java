package com.automation.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	private static WebDriver driver;
	
	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void closeDriver() {
		driver.quit();
	}
}
