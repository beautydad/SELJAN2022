package testNG;

import org.testng.annotations.Test;

public class grouptest {
	
	@Test(groups={"functionaltest","smoketesting"})
		public void testcase1() {
		System.out.println("testcase1");
	}
	
	@Test(groups={"regression testing","smoketesting"})
	public void testcase2() {
	System.out.println("testcase2");
}
	@Test(groups={"regression testing","sanitytesting"})
	public void testcase3() {
		System.out.println("testcase3");
	}
	
	
	
	

}
