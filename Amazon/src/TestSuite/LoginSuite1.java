package TestSuite;

import org.testng.annotations.Test;

import Pages.loginPage;
import Pages.signIn;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginSuite1 {
	
	public static WebDriver driver;
	public static String driverPath = "D:/New_Frame/Pancredit/Browsers/chromedriver.exe";
  @Test
  public void f() {
	  
	  
	  try
		{
		  signIn signin= new signIn(driver);
		  signin.clickSignIn();
		  Thread.sleep(4000);
		  loginPage loginpage = new loginPage(driver);
		  loginpage.login();
		  Thread.sleep(4000);
		
		 
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
		driver.quit();
  }

}
