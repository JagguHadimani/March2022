package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooMailpage {

	public static void main(String[] args) 


	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().timeouts();
		String aTitle = driver.getTitle();
		System.out.println(aTitle);
		//driver.findElement(By.xpath("//a[@class = '8246 8174 4453']")).click();
		driver.findElement(By.cssSelector("._yb_4t0u5")).click();
		//driver.findElement(By.className("_yb_4t0u5"));*/
		//WebElement element;
		driver.manage().timeouts();
		String aTitle1 = driver.getTitle();
		System.out.println(aTitle1);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("jagadish.hadimani@yahoo.com");
		driver.findElement(By.xpath("//input[@id =\"login-signin\"]")).click();
		//input[@id ="login-signin"]
		//input[@id='login-passwd']
		String aTitle2 = driver.getTitle();
		System.out.println(aTitle2);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Fossil!123");
		//button[@id="login-signin"]
		driver.findElement(By.xpath("//button[@id=\"login-signin\"]")).click();


	}

}
