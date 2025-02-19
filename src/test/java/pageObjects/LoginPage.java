package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// locator

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txt_Email;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement pwd;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btn_login;

	// action methods

	public void setEmail(String email) {
		txt_Email.sendKeys(email);
	}

	public void setPwd(String password) {
		pwd.sendKeys(password);
	}

	public void click_login() {
		btn_login.click();
	}


}
