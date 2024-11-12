package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.HomePage;
import com.pages.LoginPage;

public class BaseTest {
	
	//ChromeOptions options;
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	
	
	@BeforeMethod
	public void setUp() {
		
		// Fix for java.net.SocketException (Can use driver.close now)
			//options = new ChromeOptions();
			//options.addArguments("--remote-allow-origins=*");
		
		//Driver initialization
		driver = new ChromeDriver();
		
				
		//Fetching URL
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");		
				
		login=new LoginPage(driver);
		home=new HomePage(driver);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		//driver.close();
		
	}

}
