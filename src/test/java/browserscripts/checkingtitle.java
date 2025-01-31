package browserscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class checkingtitle {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void testGoogle() {
		driver.get("https://www.google.com");
		String expected = "Google";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected,"title does not match");
	}
	@AfterClass
	public void end() {
		driver.quit();
	}
	

}
