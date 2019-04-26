package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommonFunctions;
import Utilities.driverclass;

public class loginPage extends driverclass
{
	public loginPage(WebDriver driver) {
		super(driver);
		
	}
	 WebElement Ama_username = driver.findElement(By.xpath("//div/input[@name='email']"));
	 WebElement Ama_continue=driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']//div[2]/span[@id='continue']/span/span"));
	
	 

	public  void login() throws InterruptedException
	{
		CommonFunctions.Sendkeys(Ama_username, "7867947384");
		CommonFunctions.ActionClick(Ama_continue);
		Thread.sleep(4000);
		WebElement Ama_Pasword = driver.findElement(By.xpath("//div/input[@type='password']"));
		CommonFunctions.ActionSendKeys(Ama_Pasword, "XXXXX");
		Thread.sleep(3000);
		WebElement Ama_Login=driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/div/span/span"));
		CommonFunctions.ActionClick(Ama_Login);
		Thread.sleep(4000);
	}
}
