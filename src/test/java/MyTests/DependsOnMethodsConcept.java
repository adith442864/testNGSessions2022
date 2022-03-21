package MyTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("browser launch");
	}
	
	@Test
	public void createUserTest() {
		System.out.println("create user test");
	}
	
	@Test(priority=2)
	public void loginTest() {
		System.out.println("login to app");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest", priority=1)
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods = {"loginTest","createUserTest"}, priority=3)
	public void searchTest() {
		System.out.println("search test");
	}
	
	//Unit test :
		// test case should be independent 
		// never create any dependency between two/multiple methods..
	// every test should have it's own pre condition, test steps, assertion, status..
	
	
	
	

}
