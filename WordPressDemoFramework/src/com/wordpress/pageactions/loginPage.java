package com.wordpress.pageactions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wordpress.utility.ExcelUtil;

public class loginPage {
	
public static WebDriver driver;
	
	
	@BeforeMethod
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10462054\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement aabout;
		//aabout = wait.until( ExpectedConditions.invisibilityOf(element));
	//	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		
	}
	
	
	@DataProvider
	
	public Object[][] provideData() throws Exception,  IOException {
		
		Object[][] data = ExcelUtil.ExcelData("Login");
		
		return data;
	}
	
	@Test(dataProvider ="provideData")
	
	public static void doLogin(String UName,String UPassword) {
		
		driver.findElement(By.id("user_login")).sendKeys(UName);
		
		driver.findElement(By.id("user_pass")).sendKeys(UPassword);
		
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
		
	    // assertEquals(actual, expected);
	}
	
	@AfterMethod
	
	public static void tearDown() {
		
		driver.quit();
		
	}


}
