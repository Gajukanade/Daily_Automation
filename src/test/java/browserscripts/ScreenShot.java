package browserscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) {
				
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\automation jar files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try{
			driver.get("https://en.wikipedia.org/wiki/Hambirrao_Mohite");
			
			
			TakesScreenshot sc = (TakesScreenshot) driver;
			File srcFile = sc.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("D:\\automation jar files\\sc.png");
			
			FileUtils.copyFile(srcFile, destination);
			
			System.out.println(destination.getAbsolutePath());
		}
		catch(IOException e){
			System.out.println("error while taking ss"+e.getMessage());
			
		}
		finally {
			
		}

	}

}
