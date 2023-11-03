package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	By cart= By.cssSelector("[alt='Cart']");
	By checkOutBtn= By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");
	By promoBtn= By.cssSelector(".promoBtn");
	By placeOrder= By.xpath("//button[contains(text(), 'Place Order')]");
	public CheckoutPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void checkOutItems() {
		driver.findElement(cart).click();
		driver.findElement(checkOutBtn).click();
	}
	
	public boolean promoBtnDisplayed() {
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public boolean pleaceOrderBtnDisplayed() {
		return driver.findElement(placeOrder).isDisplayed();
	}
}
