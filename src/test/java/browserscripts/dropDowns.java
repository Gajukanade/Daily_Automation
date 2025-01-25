package browserscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Purple");
		Thread.sleep(3000);
		System.out.println("action done: ");
		driver.quit();
	
	
	}

}
