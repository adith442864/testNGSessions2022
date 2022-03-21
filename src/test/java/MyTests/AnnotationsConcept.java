package MyTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsConcept {
	
	/*
	 *  Before Suite -- DB Connection
		Before Test -- createUser
		Before class -- launchBrowser
		
			Before Method -- loginToApp
			accountInfoTest
			After Method -- logout
			
			Before Method -- loginToApp
			userInfoTest
			After Method -- logout
		
		After Class -- closeBrowser
		After Test  -- deleteUser
		After Suite  -- disconnectDB
	 */
	
	@BeforeSuite //1
	public void DBConnection() { 
		System.out.println("Before Suite -- DB Connection");
	}
	
	@BeforeTest //2
	public void createUser() {
		System.out.println("Before Test -- createUser");
	}
	
	@BeforeClass //3
	public void launchBrowser() {
		System.out.println("Before class -- launchBrowser/url");
	}
	
	@BeforeMethod //4
	public void loginToApp() {
		System.out.println("Before Method -- loginToApp");
	}
	
	
	@Test
	public void userInfoTest() {
		System.out.println("userInfoTest");
	}
	
	@Test
	public void profileTest() {
		System.out.println("profileTest");
	}
	
	@Test //5
	public void accountInfoTest() {
		System.out.println("accountInfoTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("After Method -- logout");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("After Test  -- deleteUser");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class -- closeBrowser");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("After Suite  -- disconnectDB");
	}
	

}
