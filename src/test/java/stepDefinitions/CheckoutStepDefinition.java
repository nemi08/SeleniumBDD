package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutStepDefinition {
	TestContextSetup testContextSetup;
	CheckoutPage checkoutPage;
	public CheckoutStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
		checkoutPage= testContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void checkoutItem(String name) {
		checkoutPage.checkOutItems();
	}
	
	@And("Verify if user has option to add promo code and place the order")
	public void verify_User_Is_able_to_add_Promo() {
		Assert.assertTrue(checkoutPage.promoBtnDisplayed());
		Assert.assertTrue(checkoutPage.pleaceOrderBtnDisplayed());
	}
}
