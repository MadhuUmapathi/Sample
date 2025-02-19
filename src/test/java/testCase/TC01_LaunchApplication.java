package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import junit.framework.Assert;

public class TC01_LaunchApplication extends BaseClass{
	
	@Test
	void testHomePage()
	{
		HomePage hp=new HomePage(driver);
		String confirmation=hp.confirmHomepage();
		Assert.assertEquals(confirmation,"Qafox.com");
		
		
	}
	
	

}
