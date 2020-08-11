package com.wordpress.pageactions;

import com.worppress.pageObject.LogOut;

public class LogOutTestCase extends LogOut {
	
	public static void doLogin1() throws InterruptedException {
		Thread.sleep(3000);
		LogOut.mouseHover();
	     
		
	//return ;
	}
	public static void doLogin2() throws InterruptedException {
		Thread.sleep(3000);
		LogOut.LogOutClick().click();
}
}