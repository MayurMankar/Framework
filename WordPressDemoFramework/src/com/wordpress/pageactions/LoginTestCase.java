package com.wordpress.pageactions;

import com.worppress.pageObject.LoginObjects;

public class LoginTestCase extends LoginObjects {
	
	
	public static void doLogin() throws InterruptedException {
		
		LoginObjects.enterUserName().sendKeys("opensourcecms");
		
	
		Thread.sleep(3000);
		
		LoginObjects.password().sendKeys("opensourcecms");
		LoginObjects.loginButton().click();
	
		
	}

}
