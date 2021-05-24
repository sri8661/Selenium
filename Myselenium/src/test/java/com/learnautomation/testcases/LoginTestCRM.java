package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.learnautomation.utility.*;

public class LoginTestCRM {
	
	WebDriver driver;
	
	@Test
	public void loginApp()
	
	{
	
	BrowserFactory.startApplication(driver, "Chrome", "http://freecrm.com/index.html");
	System.out.println(driver.getTitle());
	BrowserFactory.startApplication(driver, "FireFox", "http://freecrm.com/index.html");
	System.out.println(driver.getTitle());
	
		
		
		
	
	}
	
	

}
