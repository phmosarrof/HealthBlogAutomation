package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenHealth {

	WebDriver driver;
	public MenHealth(WebDriver driver){
	this.driver=driver;
		
	}
	
	By menHealth = By.xpath("//*[@id='menu-item-47']/a");
	
	
	public WebElement menhealthmenu() {
		return driver.findElement(menHealth);
		
	}
}
