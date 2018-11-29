package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vitamins {
	public WebDriver driver;

	public Vitamins(WebDriver driver) {
		this.driver = driver;

	}
	// Page Object Model

	By vitaminmenu = By.xpath("//*[@id='menu-item-46']/a");

	public WebElement vitaminMenu() {
		return driver.findElement(vitaminmenu);

	}

	By readMoreV = By.xpath("//*[@id='main-content']/div[1]/div[3]/article/div[2]/p/a");

	public WebElement readMore() {
		return driver.findElement(readMoreV);

	}

}
