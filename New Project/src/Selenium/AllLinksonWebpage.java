package Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksonWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// AllLinksonWebpage links = new AllLinksonWebpage();
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		String url = "";
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links on this page are: " + links.size());
		
		//We will iterate through the list and will check the elements in the list using Iterator.
		Iterator<WebElement> itr =  links.iterator();
		while itr.hasNext()){
			url=itr.next().getText(); //prints the link text.
		}
		
		//for (int i = 0; i < links.size(); i++) {
			

		}

	}

}
