package testCase;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC02_Login extends BaseClass {

	
	

	@Test
	void testlogin()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("goodmorning@gmail.com");
		lp.setPwd("test@1234");
		lp.click_login();
		AccountPage ap=new AccountPage(driver);
		boolean status=ap.confirmHomepage().isDisplayed();
		Assert.assertTrue(status);
		
		
	}
	
}
