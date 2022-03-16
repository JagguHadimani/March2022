package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
	// @Test(Priority)
	// @Test(groups)
	// @Test(dependsOnMethods)
	// @Test(Priority)
	// @Test(Priority)
	
	
	
	
	
	WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority=1,groups="LoginPage" )
	public void googleTitleTest()
	{
		String title= driver.getTitle();
		boolean logoVisible = driver.findElement(By.xpath("//a[@aria-label='Googleee apps']//*[local-name()='svg']")).isDisplayed();
		System.out.println(title);
	}
	
	@Test(priority=2, groups="UserProfile", dependsOnMethods="googleTitleTest")
	public void googleLogoTest()
	{
		boolean logoVisible = driver.findElement(By.xpath("//a[@aria-label='Google apps']//*[local-name()='svg']")).isDisplayed();
	}
	
	@Test(priority=4,groups="EvenList")
	public void googlMailLinkTest()
	{
		boolean gmailLink = driver.findElement(By.xpath("//a[@aria-label='Google apps']//*[local-name()='svg']")).isDisplayed();
	}
	@Test(priority=4,groups="EvenList")
	public void EvenList()
	{
		boolean EvenList = driver.findElement(By.xpath("//a[@aria-label='Google apps']//*[local-name()='svg']")).isDisplayed();
	}
	
	@Test(priority=3,groups="EventDetails")
	public void googlSignInLinkTest()
	{
		boolean signIn = driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).isDisplayed();
	}
	
	@Test(priority=3,groups="EventDetails")
	public void EventDetails()
	{
		boolean eventDetails = driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).isDisplayed();
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}
}
