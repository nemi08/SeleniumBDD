package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String url= prop.getProperty("QAUrl");
		String browser= prop.getProperty("browser");
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			if(browser.equalsIgnoreCase("chrome")) {
				driver= new ChromeDriver();
			}
			else {

			}
			driver.get(url);
			driver.manage().window().maximize();
		}
		return driver;

	}

}
