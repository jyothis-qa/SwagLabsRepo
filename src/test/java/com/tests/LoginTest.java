package com.tests;

//import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import com.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	//WebDriver driver;
	
	@Test (priority = 0)
	public void verifyLoginButtonTest() {
		
		
		//driver=new ChromeDriver();
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		
		//LoginPage login=new LoginPage(driver);
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//login.verifyLoginButton();
		
		Assert.assertEquals(login.verifyLoginButton(), true);
		
		//driver.close(); --- Results in Socket Error
		//driver.quit();
		
	}
	
	@Test (priority = 1)
	public void verifyAlertMessageTest() {
		
		
		//driver=new ChromeDriver();
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		
		//LoginPage login=new LoginPage(driver);
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.clickLoginButton();
		
		Assert.assertEquals(login.verifyAlertMessage(), "Epic sadface: Username is required");
		//driver.quit();
		
	}

}
