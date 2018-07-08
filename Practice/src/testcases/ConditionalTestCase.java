package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalTestCase {

	@Test
	public void testPageTitle() {
		try {
		System.out.println("Launching Firefox browser..");
		//System.setProperty("system.ie.browser","//usr//bin//safaridriver");
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");

		// verifying the page title
		String expPageTitle = "Google";
		boolean flag = false;
		if (driver.getTitle().equalsIgnoreCase(expPageTitle)) {
			flag = true;
			// This method will return True when the page title matches with specified string
			System.out.println("Yeah... Page title matched");
		}
		Assert.assertTrue(flag, "Page title is not matching with expected");
		}catch(Exception e) {
			e.printStackTrace();
		
	}
}
}

