package browserscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
	public static void main(String[] args) throws InterruptedException {
		//set path to the chromedriver
		System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
		
		//instantiate webdriver 
		WebDriver dr = new ChromeDriver();
		
		//open website
		dr.get("https://www.saucedemo.com/");
		
		
		System.out.println("page title is :"+ dr.getTitle());
		Thread.sleep(3000);
		
		WebElement elementById = dr.findElement(By.id("user-name"));
		WebElement password = dr.findElement(By.id("password"));
		
		WebElement btn = dr.findElement(By.xpath("//input[@id = 'login-button']"));
		
		elementById.sendKeys("standard_user");
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		btn.click();
		
		
		
		WebElement imgbag = dr.findElement(By.cssSelector(".inventory_item_img"));
		imgbag.click();
		
		Thread.sleep(2000);
		dr.quit();
	
	}

}
