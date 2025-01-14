package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	public static boolean isElementDisplayed(WebDriver driver, By byLocator) {
		
		return driver.findElement(byLocator).isDisplayed();
		
	}
	
	public static void clickElement(WebDriver driver, By byLocator) {
		
		driver.findElement(byLocator).click();
		
	}
	
	public static String getTextValue(WebDriver driver, By byLocator) {
		
		return driver.findElement(byLocator).getText();
		
	}
	
	public static void eneterText(WebDriver driver, By byLocator, String value) {
		
		driver.findElement(byLocator).clear();
		driver.findElement(byLocator).sendKeys(value);
		
	}
	

}
