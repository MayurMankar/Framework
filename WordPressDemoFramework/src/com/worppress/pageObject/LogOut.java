package com.worppress.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.wordpress.driver.DriverClass;

public class LogOut extends DriverClass {

	public static WebElement   mouseHover() {
		

		WebElement ele = driver.findElement(By.xpath("//*[@id=\'wp-admin-bar-my-account\']/a"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).build().perform();
		return ele ;
		}
	public static WebElement LogOutClick() {
		
		/*
		 * WebElement ele2=
		 * driver.findElement(By.xpath("//*[@id=\'wp-admin-bar-logout\']/a"));
		 * 
		 * Actions builder = new Actions(driver);
		 * builder.moveToElement(ele2).click().build().perform();
		 */
		//public static WebElement enterUserName() {
			
			
			 return driver.findElement( By.xpath("//*[@id=\'wp-admin-bar-logout\']/a"));
			
	
	}
	
	}


