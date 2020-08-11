package com.worppress.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.wordpress.driver.DriverClass;

public class LoginObjects extends DriverClass {
	
	
	
	public static WebElement enterUserName() {
		
		
		 return driver.findElement(By.id("user_login"));
		
	}
	
	public static WebElement password() {
		
		
		 return driver.findElement(By.id("user_pass"));
		
	
}

	public static WebElement loginButton() {
		
		
		 return driver.findElement(By.id("wp-submit"));
	
	}
	

	/*WebElement ele = driver.findElement(By.className("avatar avatar-26 photo"));
	Actions builder = new Actions(driver);
	builder.moveToElement(ele).build().perform();*/
	}

