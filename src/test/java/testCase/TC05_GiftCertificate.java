package testCase;

import org.testng.annotations.Test;

import pageObjects.GiftCertificate;
import junit.framework.Assert;
import testBase.BaseClass;

public class TC05_GiftCertificate extends BaseClass {
	@Test
	void giftPurchase()
	{
		GiftCertificate gf=new GiftCertificate(driver);
		gf.giftButton();
		gf.recepname_Clear();
		gf.recepname_Enter("madhu");
		gf.email_Clear();
		gf.email_Enter("test@gmail.com");
		gf.fromname_Clear();
		gf.fromemail_Enter("sample");
		gf.fromemail_Clear();
		gf.fromemail_Enter("sampe@gmail.com");
		gf.select_Occassion();
		gf.message("congragulations");
		gf.amount_Clear();
		gf.amount_Enter("11");
		gf.agree_Click();
		gf.continue_Click();
		String confirmation=gf.finalMessage();
		Assert.assertEquals(confirmation,"Purchase a Gift Certificate");
		
		
	
		
	}

}
