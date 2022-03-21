package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
	
	@Test(priority=1)
	public void urlTest() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		String url = driver.getCurrentUrl();
		System.out.println(url.contains("orangehrm"));
		
	}
	
	@Test(priority=2)
	public void contactSalesTest() {
		boolean flag = driver.findElement(By.linkText("CONTACT SALES")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	

}
