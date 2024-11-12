package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utilities;

public class LoginPage {
	
	WebDriver driver;
	By loginButton=By.id("login-button");
	By alertMessage=By.xpath("//h3[@data-test='error'][contains(.,'Epic sadface: Username is required')]");
	
	By username=By.id("user-name");
	By password=By.id("password");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verifyLoginButton() {
	// return driver.findElement(loginButton).isDisplayed();
		
		return Utilities.isElementDisplayed(driver, loginButton);
	}
		
	public void clickLoginButton() {
	// driver.findElement(loginButton).click();
		
		Utilities.clickElement(driver, loginButton);
	}
	
	public String verifyAlertMessage() {
	// return driver.findElement(alertMessage).getText();
		
		return Utilities.getTextValue(driver, alertMessage);
	}
	
	public void enterUsername(String uname) {
		// driver.findElement(username).sendKeys(uname);
		
		Utilities.eneterText(driver, username, uname);
		
	}
	
	public void enterPassword(String pwd) {
		// driver.findElement(password).sendKeys(pwd);
		
		Utilities.eneterText(driver, password, pwd);
		
	}
	
}
