package Pages;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
	
	public static void main(String args[])
	{
		String s1 = "USHA";
		System.out.println(s1);
		System.out.println(StringUtils.reverse("Sheik"));
		System.out.println("Comapre null and null >>>" + StringUtils.equals("Sheik", null));
		System.out.println("Check that ABCD contains none of !@#$%^&* >>>"
		        + StringUtils.containsNone("ABCD", "A@#$%^&*"));
		System.setProperty("webdriver.chrome.driver", "D:/New_Frame/Pancredit/Browsers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
		
		//Launching sample website
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().window().maximize();
		
		//Get list of web-elements with tagName  - a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//Traversing through the list and printing its text along with link address
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
	
		}
		driver.close();

}
}