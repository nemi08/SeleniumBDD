package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GeneralUtils {
	public WebDriver driver;
	
	public GeneralUtils(WebDriver driver) {
		this.driver= driver;
	}
	public void switchToWindowChild() {
		Set<String> set= driver.getWindowHandles();
		Iterator<String> itr= set.iterator();
		String mainWindow= itr.next();
		String childWindow= itr.next();
		driver.switchTo().window(childWindow);
	}

}
