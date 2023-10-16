package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.cartPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailsPage;
import Pages.productsPage;

public class Testcases extends BaseTest {
	@Test
	public void shopping() {
		new loginPage(driver).enterUserName("standard_user");
		new loginPage(driver).enterPassword("secret_sauce");
		new loginPage(driver).clickLogin();
		new productsPage(driver).clickBackPack();
		new productDetailsPage(driver).clickBackPackAddToCart();
		new productDetailsPage(driver).clickShoppingCart();
		new cartPage(driver).clickCheckOut();
		new infoPage(driver).enterDetails();
		new overviewPage(driver).clickFinish();
		String header = new completePage(driver).getHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Thank you for your order!");
		Assert.assertEquals(false, false);
	}
}
