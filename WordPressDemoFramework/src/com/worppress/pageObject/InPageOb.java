package com.worppress.pageObject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wordpress.driver.DriverClass;

public class InPageOb extends DriverClass{

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static WebElement errorName(){
			
			
			 return driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/a/div[3]"));
			
		}
		
		public static WebElement search() {
			
			
			 return driver.findElement(By.id("post-search-input"));
			
		
	}

		public static WebElement entersearch() {
			
			
			 return driver.findElement(By.id("search-submit"));
		
		}
		
	}


