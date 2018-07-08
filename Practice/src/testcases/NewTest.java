package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void testNestedIfExample() {

		System.out.println("Launching Firefox browser..");
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://facebook.com");
		By locator = By.name("firstname");
		if (driver.findElements(locator).size() > 0) {
			if (driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).sendKeys("Hello");
			}
		}

	}
}
