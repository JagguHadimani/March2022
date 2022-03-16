package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	WebDriver driver;
	
	@Test
	public void Login()
	{
		String title= driver.getTitle();
		System.out.println("title");
	}
	
	@Test(dependsOnMethods = "Login")
	public void UserProfile()
	{
	//	String title= driver.getTitle();
		System.out.println("UserProfile");
	}
	

}
