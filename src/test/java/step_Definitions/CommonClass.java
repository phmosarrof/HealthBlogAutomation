package step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModel.Medecine;
import pageObjectModel.Vitamins;

public class CommonClass {
	public WebDriver driver;
	public CommonClass() {
		
	}
	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.health.holyworld.org/");
		
		Medecine obj = new Medecine(driver);
		
		obj.medMenu().click();
		obj.readMore().click();
		
		
		Vitamins obj2 =new Vitamins(driver);
		
		obj2.vitaminMenu().click();
		obj2.readMore().click();
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		driver.findElement(By.xpath("//*[@id='menu-item-48']/a")).click(); 
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[3]/article/div[2]/p/a")).click();
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='menu-item-46']/a")).click();
		
		driver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[3]/article/div[2]/p/a")).click();
		*/
		
		
		
		
	}

}
