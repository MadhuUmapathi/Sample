package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCertificate extends BasePage {

	public GiftCertificate(WebDriver driver) {
		super(driver);
		
	}
	//locators
	
	@FindBy(xpath="//a[normalize-space()='Gift Certificates']")
	WebElement gift_button;
	
	
	@FindBy(xpath="//input[@id='input-to-name']")
	WebElement recepname_clear;
	
	@FindBy(xpath="//input[@id='input-to-name']")
	WebElement recepname_enter;
	
	@FindBy(xpath="//input[@id='input-to-email']")
	WebElement email_clear;
	
	@FindBy(xpath="//input[@id='input-to-email']")
	WebElement email_enter;
	
	@FindBy(xpath="//input[@id='input-from-name']")
	WebElement fromname_clear;
	
	@FindBy(xpath="//input[@id='input-from-name']")
	WebElement fromname_enter;
	
	@FindBy(xpath="//input[@id='input-from-email']")
	WebElement fromemail_clear;
	
	@FindBy(xpath="//input[@id='input-from-email']")
	WebElement fromemail_enter;
	
	@FindBy(xpath="//label[normalize-space()='Christmas']")
	WebElement select_occassion;
	
	@FindBy(xpath="//textarea[@id='input-message']")
	WebElement message;
			
	@FindBy(xpath="//input[@id='input-amount']")
	WebElement amount_clear;
	
	@FindBy(xpath="//input[@id='input-amount']")
	WebElement amount_enter;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agree_click;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continue_click;
	
	@FindBy(xpath="//h1[normalize-space()='Purchase a Gift Certificate']")
	WebElement finalmessage;	
	
	//action methods
	public void giftButton()
	{
		gift_button.click();
	}
	public void recepname_Clear()
	{
		recepname_clear.clear();
	}
	public void recepname_Enter(String recepname)
	{
		recepname_enter.sendKeys(recepname);
	}
	public void email_Clear()
	{
		email_clear.clear();
	}
	public void email_Enter(String email)
	{
		email_enter.sendKeys("madhu@efg.com");
	}
	public void fromname_Clear()
	{
		fromname_clear.clear();
	}
	public void fromname_Enter(String fromname)
	{
		fromname_enter.sendKeys(fromname);
	}
	public void fromemail_Clear()
	{
		fromemail_clear.clear();
	}
	public void fromemail_Enter(String fromemail)
	{
		fromemail_enter.sendKeys(fromemail);
	}
	public void select_Occassion()
	{
		select_occassion.click();
	}
	public void message(String messageto)
	{
		message.sendKeys(messageto);
	}
	public void amount_Clear()
	{
		amount_clear.clear();
	}
	public void amount_Enter(String amount)
	{
		amount_enter.sendKeys(amount);
	}
	public void agree_Click()
	{
		agree_click.click();
	}
	public void continue_Click()
	{
		continue_click.click();
	}
	public String finalMessage()
	{
		return finalmessage.getText();
		
	}
	
	
	

}
