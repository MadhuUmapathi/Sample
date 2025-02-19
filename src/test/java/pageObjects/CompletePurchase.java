package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompletePurchase extends BasePage {

	public CompletePurchase(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//locators
	@FindBy(xpath="//span[@id='cart-total']")
	WebElement cart_button;
	
	@FindBy(xpath="//strong[normalize-space()='Checkout']")
	WebElement checkout_button;

	@FindBy(xpath="//input[@id='input-email']")
	WebElement input_email;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement input_pwd;

	@FindBy(xpath="//input[@value='Login']")
	WebElement login_click;

	@FindBy(xpath="//input[@id='button-payment-address']")
	WebElement payment_button;

	@FindBy(xpath="//input[@id='button-shipping-address']")
	WebElement shipping_address;

	@FindBy(xpath="//input[@id='button-shipping-method']")
	WebElement shipping_method;

	@FindBy(xpath="//input[@name='agree']")
	WebElement agree_button;

	@FindBy(xpath="//input[@id='button-payment-method']")
	WebElement payment_method;

	@FindBy(xpath="//input[@id='button-confirm']")
	WebElement confirm_button;
	
	@FindBy(xpath="//h1[normalize-space()='Your order has been placed!']")
	WebElement finalmessage1;
	
	public void cart_Button()
	{
		cart_button.click();
	}
	public void checkout_Button()
	{
		checkout_button.click();
	}
	
	public void payment_Button()
	{
		payment_button.click();
	}
	
	public void shipping_Method()
	{
		shipping_method.click();
	}
	public void shipping_Address()
	{
		shipping_address.click();
	}
	public void agree_Button()
	{
		agree_button.click();
	}
	public void payment_Method()
	{
		payment_method.click();
	}
	public void confirm_Button()
	{
		confirm_button.click();
	}
	public WebElement finalMessage1()
	{
		return finalmessage1;
	}
	
	

}
