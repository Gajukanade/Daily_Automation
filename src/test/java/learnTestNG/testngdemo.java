package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngdemo {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Setting up browser and environment...");
	}
	
	@Test
	public void loginTest() {
		System.out.println("Executing login test....");
	}
	
	@Test
	public void logouttest() {
		System.out.println("logout test executed..");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("closing browser and cleaning up..");
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void testExample() {
//		System.out.println("This is first testng test");
//	}
//	
//	@Test
//	public void vaildatetitle() {
//		String actualtitle = "Google";
//		String expectedTitle = "Google";
//		Assert.assertEquals(actualtitle, expectedTitle,"title mismatch");
//	}

}
