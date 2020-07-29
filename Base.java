package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.opesmount.in/grocerystore1/");
			Thread.sleep(3000);
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

	

}
