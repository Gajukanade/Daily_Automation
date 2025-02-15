package browserscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://demoqa.com/browser-windows");
			driver.manage().window().maximize();
			
			WebElement newwindow = driver.findElement(By.id("windowButton"));
			newwindow.click();
			//store main window handle
			String mainwindow = driver.getWindowHandle();

            // Get all open window handles
			Set<String> allWindow = driver.getWindowHandles();
	
		for(String handle : allWindow) {
			if(!handle.equals(mainwindow)) {
				driver.switchTo().window(handle);				
			}	
		}
	}
		finally {
			System.out.println("Program run successfully...");
		}

	}
}
