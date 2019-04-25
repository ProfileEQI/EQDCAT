package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonFunctions extends driverclass
{
	
	protected CommonFunctions(WebDriver driver) {
		super(driver);
		
	}
	public static void ActionClick(WebElement element)
	{
		
		Actions actions = new Actions(driver);
		
		actions.click(element).build().perform();
		
		
	}
	public static void  click(WebElement element)
	{
		try
		{
		element.click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void Sendkeys(WebElement element,String param)
	{
		try
		{
			element.clear();
		    element.sendKeys(param);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static void mouseHover(WebElement element) throws InterruptedException
	{
		Actions action = new Actions(driver);
        Thread.sleep(3000);
		action.moveToElement(element).build().perform();
	}
	
	public static void ActionSendKeys(WebElement element,String str)
	{
		
		Actions actions = new Actions(driver);
		actions.sendKeys(element, str).build().perform();
		
	}
	
	

}
