package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePomClass 
{
	@FindBy(id="username")
	private WebElement username;

	public SamplePomClass(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
