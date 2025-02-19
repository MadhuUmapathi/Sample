package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class WishList extends BasePage {

	public WishList(WebDriver driver) {
		super(driver);
		
	}
	//locators
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	WebElement selectproduct;

	@FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
	WebElement showproducts;

	@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'HP LP3065')]")
	WebElement makeselection;

	
	@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")
	WebElement addtowish;
	
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
	public void addToWishButton()
	{
		addtowish.click();
	}
	

}
