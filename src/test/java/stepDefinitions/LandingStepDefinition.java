package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

import utils.TestContextSetup;

public class LandingStepDefinition {
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	public LandingStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
		this.landingPage= testContextSetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(landingPage.getTitle().contains("GreenKart"));
	}
	@When("^User searched the product with shortname (.+) and extracted actual name of the product$")
	public void user_searched_the_product_with_shortname_and_extracted_actual_name_of_the_product(String shortName) throws InterruptedException {
		//pageObjectManager= new PageObjectManager(testContextSetup.driver);
		landingPage= testContextSetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageProductName= testContextSetup.pageObjectManager.getLandingPage().getSearchText().split("\\ ")[0].trim();
	}

	@And("Added {string} items of the selected product to cart")
	public void addingTheItem(String quantity) {
		int count= Integer.parseInt(quantity);
		landingPage= testContextSetup.pageObjectManager.getLandingPage();
		landingPage.increment(count);
		landingPage.addToCart();
	}
}
