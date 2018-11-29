package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenHealth {
	WebDriver driver;

	public WomenHealth(WebDriver driver) {
		// this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(text(),'Women’s Health')]")
	WebElement WomenMenu;

	public WebElement womenhealthmenu() {
		return WomenMenu;

	}
}
