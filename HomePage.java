package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement a1;
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement a2;
	  public void srch() throws InterruptedException
		{
		  a1.sendKeys("Green Cabbage");
		  Thread.sleep(1000);
a2.click();
Thread.sleep(1000);
		 
		  

}
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}



}
