package runnerClass;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = {"driverManager","runnerClass","Step_Definitions","pageObjectModel"
				
		}, 
		tags= {"~@Wip","@Smoke","@Functional","@Regression"
				
		},
		monochrome = true 
		//plugin = { "pretty", "html:target/Cucumber.html", "Junit:target/junitreport.xml"}
		)

public class RunnerCukes extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public static void initializeMethod() {
		
	}
	
	@AfterSuite
	public static void finishMethod() {
		
	}
	
	
}
