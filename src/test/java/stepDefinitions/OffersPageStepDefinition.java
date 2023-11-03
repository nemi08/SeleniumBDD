package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OffersPageStepDefinition {

	String offerPageProductPageName;
	TestContextSetup testContextSetup;
	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
	}
	@Then("^User search for the same shortname (.+) in offers page to check if product exists$")
	public void user_search_for_the_same_shortname_in_offers_page_to_check_if_product_exists(String shortName) throws InterruptedException {
		switchToOffersPage();
		OffersPage offersPage= testContextSetup.pageObjectManager.getOffersPage();
		offersPage.searchItem(shortName);
		offerPageProductPageName= testContextSetup.pageObjectManager.getOffersPage().getProductName();
	}

	public void switchToOffersPage() {
		LandingPage landinPage= testContextSetup.pageObjectManager.getLandingPage();
		landinPage.selectTopDeals();
		testContextSetup.generalUtils.switchToWindowChild();
	}


	@Then ("validate product name in offer page matches with landing page")
	public void validate_product_name_in_offer_page_matches_with_landing_page() {
		System.out.println(offerPageProductPageName);
		Assert.assertEquals(testContextSetup.landingPageProductName, offerPageProductPageName);
	}


}
