package browserscripts;

import org.testng.annotations.Test;

public class ThreadPooling {
	
	@Test(invocationCount = 5, threadPoolSize = 2)
	public void executeTest() {
		System.out.println("Executing test with test id "+ Thread.currentThread().getId());
	}

}
 