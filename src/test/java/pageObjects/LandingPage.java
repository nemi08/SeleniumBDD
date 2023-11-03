package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	By search= By.xpath("//input[@type='search']");
	By productName= By.cssSelector("h4.product-name");
	By topDeals= By.linkText("Top Deals");
	By plusBtn= By.cssSelector("a.increment");
	By addToCart= By.xpath("//button[text()= 'ADD TO CART']");
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver= driver;
	}

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public String getSearchText() {
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDeals() {
		driver.findElement(topDeals).click();
	}
	
	public void increment(int count) {
		while(count>1) {
			driver.findElement(plusBtn).click();
			count--;
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	public String getTitle() {
		return driver.getTitle();
	}
}
