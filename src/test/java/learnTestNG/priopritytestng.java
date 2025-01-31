package learnTestNG;

import org.testng.annotations.Test;

public class priopritytestng {
	
	@Test(priority = 2)
	public void secondTest() {
		System.out.println("executing second test");
	}
	
	@Test(priority = 1)
	public void firsttest() {
		System.out.println("first case");
	}
	
	@Test(priority = 3)
	public void thirdTest() {
		System.out.println("Executing third test");
	}

}
