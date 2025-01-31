package learnTestNG;

import org.testng.annotations.Test;

public class groupingTestcases {
	
	@Test(groups = "regression")
	public void test1() {
		System.out.println("regression testing group");
		
	}
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("smoke testing group");
		
	}
	@Test(groups = "regression")
	public void test3() {
		System.out.println("regression testing group");
		
	}
	@Test(groups = { "smoke","retesting"})
	public void test4() {
		System.out.println("smoke and retesting testing group");
		
	}
	@Test(groups = "regression")
	public void test5() {
		System.out.println("regression testing group");
		
	}
	@Test(groups = {"regression","retesting"})
	public void test6() {
		System.out.println("regression and retesting testing group");
		
	}

}
