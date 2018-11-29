package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Medecine {
	public WebDriver driver;

	public Medecine(WebDriver driver) {
		this.driver = driver;

	}
	
	// Page Object Model and PageFactory

	By medicine = By.xpath("//*[@id='menu-item-48']/a");

	public WebElement medMenu() {
		return driver.findElement(medicine);

	}

	By readMore = By.xpath("//*[@id='main-content']/div[1]/div[3]/article/div[2]/p/a");

	public WebElement readMore() {
		return driver.findElement(readMore);

	}

}
