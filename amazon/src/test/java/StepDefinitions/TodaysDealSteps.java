package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AmazonPages.TodaysDeal;
import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;

public class TodaysDealSteps extends TodaysDeal{

	@And("^I want to clicks \"(.*)\"$")
	public void i_want_selec(String xpath) {
		wait=new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		clickButton(xpath);
		//System.out.println(name);
		//driver.findElement(By.xpath(objectXpath.getProperty(xpath))).click();
		
	}
	
	}
