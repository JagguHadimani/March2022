package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.IReporter;

public class DataDrivenFramework implements IReporter
{
	
	/*public String path;
	public FileInpuStream fis = null;
	public FileoutputStream fileout =null;
	private XSSFWorkbook workbook = null;
	private XSSFSheel sheet = null;
	private XSSFCell cell = null;*/
	
	
	public static void main(String[] args)
	{
	WebDriver driver = null;
	Select select = new Select(driver.findElement(By.xpath("dfg")));
	select.selectByIndex(2);
	select.selectByValue("");
	select.selectByVisibleText("");
	select.getAllSelectedOptions();
	
	DataDrivenFramework extent;
	//extent = new 
	}

}
