package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome= true, tags="@CheckoutPage",
				 plugin= {" com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
						  
public class TestRunner {

//	public Object[][] scenario(){
//		return super.scenario();
//	}
}
