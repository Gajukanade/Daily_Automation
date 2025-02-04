package browserscripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarDate {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		
		WebElement clickdatepick = driver.findElement(By.id("datepicker"));
		clickdatepick.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	

		
		while(true) {
			String yeardown = driver.findElement(By.className("ui-datepicker-year")).getText();
			if (yeardown.equals("2021")){
			break;	
		}
		driver.findElement(By.className("ui-datepicker-prev")).click();
		
	}
		
		while(true) {
			String displaymonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			
			if(displaymonth.equals("January")) {
				break;
			}
			driver.findElement(By.className("ui-datepicker-prev")).click();
		}
	WebElement date = driver.findElement(By.xpath("//a[text()='7']"));
	date.click();
		
	}

}
