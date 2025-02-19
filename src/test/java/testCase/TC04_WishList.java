package testCase;

import org.testng.annotations.Test;

import pageObjects.WishList;
import testBase.BaseClass;

public class TC04_WishList extends BaseClass {
	
	@Test
	void addtoWishList()
	{
		WishList aw=new WishList(driver);
		aw.selectProduct();
		aw.showProducts();
		aw.makeSelection();
		aw.addToWishButton();
	}

}
