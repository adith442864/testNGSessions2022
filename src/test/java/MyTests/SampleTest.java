package MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	
	// @Test is mandatory to execute the testng 
	// BeforeMethod is highly useful when application has huge test cases (regression)
	// BeforeTest will be executed once. 
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
	}	
	
	@Test
	public void searchTest() {
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void googleSearchButtonTest() {
		boolean flag = driver.findElement(By.name("btnK")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void urlTest() {
		String url = driver.getTitle();
		Assert.assertTrue(url.contains("google"));
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	

}
