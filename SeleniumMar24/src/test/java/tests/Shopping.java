package tests;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailsPage;
import Pages.productsPage;
import utils.ReadData;


public class Shopping extends BaseTest{   
			
		@Test
		public void ShopABag() throws IOException {		
		new loginPage(driver).enterUsername(new ReadData().getUsername());
		new loginPage(driver).enterPassword(new ReadData().getPassword());
		new loginPage(driver).clickSubmit();
		new productsPage(driver).clickBackPack();
		new productDetailsPage(driver).clickAddToCart();
		new productDetailsPage(driver).clickAddShoppingBadge();
		new cartPage(driver).clickCheckout();
		new infoPage(driver).enterDetails();
		new overviewPage(driver).clickFinish();
		String actualHeading = new completePage(driver).getHeading();
		String expectedHeading = "Thank you for your order!";
		Assert.assertEquals(actualHeading, expectedHeading);
		}
				
		
	}
