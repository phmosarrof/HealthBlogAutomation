package step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.MenHealth;
import pageObjectModel.WomenHealth;

public class End2EndTest {

	public WebDriver driver;

	@When("^I click the Men Health menu$")
	public void i_click_the_Men_Health_menu() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		MenHealth obj = new MenHealth(driver);
		
		driver.get("http://www.health.holyworld.org/");
		obj.menhealthmenu().click();
	}

	@Then("^I enter into Men Health page$")
	public void i_enter_into_Men_Health_page() throws Throwable {
		System.out.println("It is Men Health's page");
	}
		

	@When("^I click the Women Health menu$")
	public void i_click_the_Women_Health_menu() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WomenHealth obj2 = new WomenHealth(driver);
		driver.get("http://www.health.holyworld.org/");
		obj2.womenhealthmenu().click();
	}

	@Then("^I enter into Women Health page$")
	public void i_enter_into_Women_Health_page() throws Throwable {
		System.out.println("It is woman page");
	}
	@Then("^I close the browser$")
	public void i_close_the_browser( WebDriver Driver) throws Throwable {
		driver.close();
	}
		
}
