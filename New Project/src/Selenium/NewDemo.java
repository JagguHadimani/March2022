package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewDemo {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.navigate().to("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//a[normalize-space()='3.141.59']")).click();
		driver.close();
*/
		//Geko Driver set up before using the Firefox Driver.
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.selenium.dev/");
		driver1.navigate().to("https://www.selenium.dev/downloads/");
		driver1.findElement(By.xpath("//a[normalize-space()='3.141.59']")).click();
		// Can use this script to test alert pop up.
		//driver1.close();

		//p[@class='releases-button']
		// /html[1]/body[1]/div[1]/div[2]/p[1]/a[1]
		//div[class='split-section container dark-background'] p:nth-child(1) a:nth-child(1)
	}

}
