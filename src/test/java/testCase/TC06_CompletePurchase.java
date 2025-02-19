package testCase;

import pageObjects.AddToCart;
import pageObjects.CompletePurchase;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import org.testng.annotations.Test;

import junit.framework.Assert;
import testBase.BaseClass;

public class TC06_CompletePurchase extends BaseClass{
	@Test
	void completepurchase()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("goodmorning@gmail.com");
		lp.setPwd("test@1234");
		lp.click_login();
		AddToCart ac=new AddToCart(driver);
		ac.selectProduct();
		ac.showProducts();
		ac.makeSelection();
		ac.addToCartButton();
		CompletePurchase cp=new CompletePurchase(driver);
		cp.cart_Button();
		cp.checkout_Button();
		cp.payment_Button();
		cp.shipping_Address();
		cp.shipping_Method();
		cp.agree_Button();
		cp.payment_Method();
		cp.confirm_Button();
		boolean status1=cp.finalMessage1().isDisplayed();
		Assert.assertTrue(status1);
		
	}

}
