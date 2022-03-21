package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	@Test(priority=1)
	public void searchTest() {
//		driver.get("https://google.com");	
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void googlesearchBtnTest() throws InterruptedException {
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[@class='CqAVzb lJ9FBc']//input[@name='btnK']")).getText();
		System.out.println(text);
	}
	
	@Test(priority=3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url.contains("google"));
		
	}


}
