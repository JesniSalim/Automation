package test;

import org.testng.annotations.Test;

import pages.HomePage;
import utilities.Base;


public class HomeTest extends Base {
	@Test(priority=0)
	  public void Home() throws InterruptedException {
		  HomePage ob =new HomePage(driver);
		  ob.srch();
		  
	  }
	}
