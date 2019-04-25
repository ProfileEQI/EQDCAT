package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CommonFunctions;
import Utilities.driverclass;

public class signIn extends driverclass {
	
	public signIn(WebDriver driver) {
		super(driver);
		
	}


	 WebElement Ama_Account=driver.findElement(By.xpath("//span[text()='Hello, Sign in']")); 
	 WebElement Ama_singin=driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
	
    
    public  void clickSignIn() throws InterruptedException
    {
    	CommonFunctions.mouseHover(Ama_Account);
    	Thread.sleep(3000);
    	CommonFunctions.click(Ama_singin);
    	Thread.sleep(3000);
    }
}
