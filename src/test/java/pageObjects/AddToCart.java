package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {
	
	public AddToCart(WebDriver driver) {
		super(driver);
	
	}
	//locators
	
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	WebElement selectproduct;

	@FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
	WebElement showproducts;

	@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'HP LP3065')]")
	WebElement makeselection;

	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtocartbutton;

	//methods
	public void selectProduct()
	{
		selectproduct.click();
	}
	public void showProducts()
	{
		showproducts.click();
	}
	public void makeSelection()
	{
		makeselection.click();
	}
	public void addToCartButton()
	{
		addtocartbutton.click();
	}

}
