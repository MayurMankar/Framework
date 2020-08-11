package com.wordpress.pageactions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sslogin {
     //Static driver();
	//public static void main(String[] args) {
		
		@Test
		public void capturescrrenshot()
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10462054\\Documents\\chromedriver_win32\\chromedriver.exe");
			
			 ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
			driver.manage().window().maximize();
			
			driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
			driver.findElement(By.id("user_login")).sendKeys("wordpress");
			
			driver.findElement(By.id("user_pass")).sendKeys("wordpress");
			
			driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
			
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); FileUtils.(source,
		 * "./Screenshot/FirstOne.png");
		 */
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(source, new File("./Screenshot/POIss.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//org.apache.commons.io.FileUtils.getFile(source, "./Screenshots/FirstOne.png");
			try {

				//FactoryUtils.copyFile(source, new File("./Screenshot"));
				org.openqa.selenium.io.FileHandler.copy(source, new File("./Screenshot/first.png"));
				// File("/Data_Driven_Framework/src/test/resources/Screenshots/"+result.getName()+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}

	}

