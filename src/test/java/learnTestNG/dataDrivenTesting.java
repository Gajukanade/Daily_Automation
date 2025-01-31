package learnTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenTesting {
	
	@DataProvider(name = "loginData")
	public Object[][] getData(){
		return new Object[][] {
			
			{"admin", "admin123"},
			{"user1", "password1"},
			{"user2", "password2"}
			
		};
	
	}
	@Test(dataProvider = "loginData")
	public void loginTest(String username,String password) {
		System.out.println("Testing login with : "+ username + " "+ password);
	}

}
