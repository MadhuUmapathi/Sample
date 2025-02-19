package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.AddToCart;
import testBase.BaseClass;

public class TC03_AddToCart extends BaseClass {
	
	@Test
	void addtoCart()
	{
		AddToCart ac=new AddToCart(driver);
		ac.selectProduct();
		ac.showProducts();
		ac.makeSelection();
		ac.addToCartButton();
		
		
	}
	

}
