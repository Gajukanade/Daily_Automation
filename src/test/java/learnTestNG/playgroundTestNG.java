package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class playgroundTestNG {
	
	@Test
	public void testhardassertion() {
		
		int actual = 10;
		int expected = 10;
		
		System.out.println("Before Assertion");
		Assert.assertEquals(actual, expected, "values do not match");
		System.out.println("After assertions");
		
		
	}

}
