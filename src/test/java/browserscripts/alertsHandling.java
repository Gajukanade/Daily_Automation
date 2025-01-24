package browserscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement clickA = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		clickA.click();
		
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Alert text getting :" + simpleAlert.getText());
		Thread.sleep(3000);
		simpleAlert.accept();
		
//		Alert alert = driver.switchTo().alert();  // Switch to the alert
//		alert.accept();  // Click OK
//		alert.dismiss(); // Click Cancel (for confirmation alerts)
//		String alertText = alert.getText();  // Get the alert message
//		alert.sendKeys("Sample Input");  // Enter text (for prompt alerts)

		
	}

}
