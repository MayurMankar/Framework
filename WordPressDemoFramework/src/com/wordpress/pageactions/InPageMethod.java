package com.wordpress.pageactions;

import com.worppress.pageObject.InPageOb;
import com.worppress.pageObject.LoginObjects;

public class InPageMethod {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void doLogin3() throws InterruptedException {
		InPageOb.errorName().click();
		Thread.sleep(3000);
		InPageOb.search().sendKeys("outcomes");
		InPageOb.entersearch().click();
		

	}

}
