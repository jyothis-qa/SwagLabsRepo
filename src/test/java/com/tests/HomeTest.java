package com.tests;

//import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import com.pages.HomePage;
//import com.pages.LoginPage;

public class HomeTest extends BaseTest {
	
	//WebDriver driver;
	
	@Test(priority = 0)
	public void swagLabsHeadingTest() {
		
		
		//Driver initialization
		//driver=new ChromeDriver();
		
		//Fetching URL
		//driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		
		
		//LoginPage login=new LoginPage(driver);
		
		//HomePage home=new HomePage(driver);
		
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.clickLoginButton();
		
		//Validating heading
		Assert.assertEquals(home.verifySwagLabsHeading(), "Swag Labs");
		
		//driver.close(); --- Results in Socket Error
		//driver.quit();
		
	}
	
	@Test(priority = 1)
	public void productsHeadingTest() {
		
		
		//Driver initialization
		//driver=new ChromeDriver();
		
		//Fetching URL
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		
		//LoginPage login=new LoginPage(driver);
		
		//HomePage home=new HomePage(driver);
		
		login.enterUsername("standard_user");
		//Thread.sleep(1000);
		login.enterPassword("secret_sauce");
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.clickLoginButton();
		
		//Validating heading
		Assert.assertEquals(home.verifyProductsHeading(), "Products");
		
		//driver.close(); --- Results in Socket Error
		//driver.quit();
		
	}

}
