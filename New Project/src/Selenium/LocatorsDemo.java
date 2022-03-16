package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		//Geko Driver set up before using the Firefox Driver.
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\drivers\\geckodriver\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("ursjaggu@gmail.com");
		driver.findElement(By.className("className"));
		driver.findElement(By.cssSelector("cssSelector"));
		driver.findElement(By.linkText("linkText"));
		driver.findElement(By.name("name"));
		driver.findElement(By.xpath("xpathExpression"));
		//driver.findElement(By.tagName("a")); // This will return multiple elemetns so we need to catch the opt with either List or Set
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links on this page are: " + links.size());
	}

}
