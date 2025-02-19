package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Qafox.com']")
	WebElement content_homepage;
	
	@FindBy(xpath="//span[@class='caret']")
	WebElement click_myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement clicklogin;
	
	public void clickMyAccount()
	{
		click_myaccount.click();
	}
	public void clickLogin()
	{
		clicklogin.click();
	}
	public String confirmHomepage()
	{
		return content_homepage.getText();
		
	}

}
