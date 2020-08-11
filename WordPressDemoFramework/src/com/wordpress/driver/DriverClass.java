package com.wordpress.driver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.wordpress.pageactions.InPageMethod;
import com.wordpress.pageactions.LogOutTestCase;
import com.wordpress.pageactions.LoginTestCase;

public class DriverClass {
     
	public static WebDriver driver;

 // private static Logger logger  = LogManager.getLogger(DriverClass.class);
  
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\P10462054\\Documents\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		/*
		 * logger.info("my name is khan"); logger.error("this is an error message");
		 * logger.warn("this is warn message"); logger.fatal("this is fatal message");
		 */
		
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		driver.manage().window().maximize();
		
		// this is new commit from mayur
		LoginTestCase.doLogin();
		InPageMethod.doLogin3();
		LogOutTestCase.doLogin1();
        LogOutTestCase.doLogin2();
        InPageMethod.doLogin3();
	}
}