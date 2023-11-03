package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public GeneralUtils generalUtils;
	public TestBase testBase;
	public TestContextSetup() throws IOException {
		testBase= new TestBase();
		pageObjectManager= new PageObjectManager(testBase.WebDriverManager());
		generalUtils= new GeneralUtils(testBase.WebDriverManager());
	}
}
