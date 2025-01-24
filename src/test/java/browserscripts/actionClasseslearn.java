package browserscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClasseslearn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(source,target).perform();
		System.out.println("Drag and Drop Action performed");
//		driver.get("https://demoqa.com/menu");
//		
//		WebElement menuclick = driver.findElement(By.xpath("//a[text()='Main Item 1']"));
////		menuclick.click();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(menuclick).perform();
//		
//		System.out.println("mouse over performed:");
	}

}
