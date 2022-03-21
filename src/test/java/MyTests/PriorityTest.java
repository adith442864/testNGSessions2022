package MyTests;

import org.testng.annotations.Test;

public class PriorityTest {
	
	// Negative Priority should be possible(-1,-2,0,-2)
	// Non Priority TC's should be executed and followed with priority based TCs.
	
	@Test(priority=2)
	public void a_test() {
		System.out.println("a test");
	}
	
	
	@Test(priority=3)
	public void b_test() {
		System.out.println("b test");
	}

	
	@Test(priority=1)
	public void c_test() {
		System.out.println("c test");
	}

	
	@Test(priority=3)
	public void d_test() {
		System.out.println("d test");
	}
	
	@Test
	public void e_test() {
		System.out.println("e test");
	}
	
	@Test
	public void f_test() {
		System.out.println("f test");
	}


}
