package tests;

import base.BaseTest;
import pages.*;
import org.testng.annotations.Test;

public class SignupAndAddToCartTest extends BaseTest {

	@Test
	public void signupAndAddProduct() {

		HomePage home = new HomePage(driver);
		SignupPage signup = new SignupPage(driver);
		AccountPage account = new AccountPage(driver);
		ProductPage product = new ProductPage(driver);
		CartPage cart = new CartPage(driver);

		home.clickSignupLogin();
		signup.newUserSignup("John", "Mathew" + System.currentTimeMillis() + "@yopmail.com");
		account.fillAccountDetails();

		home.clickProducts();
		product.searchProduct("Blue Top");
		product.addProductToCart();
		cart.proceedCheckout();
	}
}
