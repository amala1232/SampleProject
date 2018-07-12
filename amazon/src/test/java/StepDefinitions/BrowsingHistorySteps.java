package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AmazonPages.BrowsingHistory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class BrowsingHistorySteps extends BrowsingHistory{
	
	public  BrowsingHistorySteps() throws Throwable{
		super();
	
	}	
	 @Given("^I want to open \"(.*)\" browser$")
    public void want_to_open_browser(String browser){
		openBrowser(browser);
	}
	 @And("^I want to launch the application$")
	 public void i_want_launch_application() {
		 navigateURL(objectXpath.getProperty("URL"));
	 }
	 @And("^I want to enter a value to \"(.*)\" as \"(.*)\"$")
	 public void want_to_enter(String xpath,String textValue) {
		 enterText(xpath,textValue);
	 }
	/// @Then("^I want to click \"(.*)\"$")
	 ///public void want_click(String xpath) throws Throwable {
		 //Thread.sleep(1000);
		 //wait=new WebDriverWait(driver,10);
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	//	 clickButton(xpath);
	// }
	 
	 
	 @And("^I want to click \"(.*)\"$")
		public void i_want_select(String xpath) {
			
			clickButton(xpath);
			//System.out.println(name);
			//driver.findElement(By.xpath(objectXpath.getProperty(xpath))).click();
			
		}
  }

	


