package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import TestSuite.*;


public class driverclass 
{
	public static WebDriver driver;
	
	public driverclass(WebDriver driver)
	{
		driverclass.driver = driver;
		
	}
}
