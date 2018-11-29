package step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.MenHealth;
import pageObjectModel.WomenHealth;

public class HealthHome {

	WebDriver driver;

	@Given("^I want to go to the home page of the Health blog$")
	public void i_want_to_go_to_the_home_page_of_the_Health_blog() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("It is Health blog's home page");
		driver.get("http://www.health.holyworld.org/");
	}

	@When("^I want to click the Children Health menu$")
	public void i_want_to_click_the_Children_Health_menu() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.health.holyworld.org/");
		System.out.println("New block");
		
		MenHealth obj3 = new MenHealth(driver);
		obj3.menhealthmenu().click();

		Thread.sleep(2000);
		WomenHealth obj4 = new WomenHealth(driver);
		obj4.womenhealthmenu().click();

	}

	@When("^I want to click the Food menu$")
	public void i_want_to_click_the_Food_menu() throws Throwable {

	}

	@Then("^I validate the Children Health page is open successfully$")
	public void i_validate_the_Children_Health_page_is_open_successfully() throws Throwable {

	}

	@Then("^I validate the Children Food page is open successfully$")
	public void i_validate_the_Children_Food_page_is_open_successfully() throws Throwable {

	}

	@When("^I check for the \"(.*?)\" in the right upper corner of the home Page$")
	public void i_check_for_the_in_the_right_upper_corner_of_the_home_Page(String arg1) throws Throwable {

	}

	@Then("^I verify the \"(.*?)\" open successfully$")
	public void i_verify_the_open_successfully(String arg1) throws Throwable {

	}

}
