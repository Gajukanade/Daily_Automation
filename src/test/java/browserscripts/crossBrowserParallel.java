package browserscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserParallel {
	
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
			Thread.sleep(3000);
		}else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\automation jar files\\msedgedriver.exe");
			driver = new EdgeDriver();
			Thread.sleep(3000);
			
		}
	}
	
	@Test
	public void verifyTitle() throws InterruptedException {
		driver.get("\"https://www.google.com\"");
		Assert.assertEquals(driver.getTitle(), "google","Title does not match");
		Thread.sleep(3000);
	}
	@AfterClass
	public void quitbr() {
//		driver.quit();
	}
	

}
