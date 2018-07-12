package CommonBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.safari.SafariDriver;


public class AppDiver {
		public static WebDriver driver;
		public static Properties objectXpath;
		public static WebDriverWait wait;
		
		 public AppDiver() {
			 objectXpath = new Properties();
			 FileInputStream fs;
			try {
				fs = new FileInputStream(new File("//Users//rakesh//amala folder//amazon//src//test//java//ConfigData//ObjectRepo.properties"));
				objectXpath.load(fs);
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						}

		//FileInputStream fs;
	/*	public void AppDriver() throws Throwable {
			objectXpath = new Properties();
//			URL=http://www.amazon.com
//				Search_Data=//input[@id='twotabsearchtextbox']
//				Go_Btn=//input[@value='Go']			
			//objectXpath.setProperty("URL", "http://www.amazon.com");
			
			FileInputStream fs=new FileInputStream(new File("//Users//rakesh//amala folder//amazon//src//test//java//ConfigData//ObjectRepo.properties"));
		objectXpath.load(fs);
		System.out.println(objectXpath);
		}*/
	
	public static void openBrowser(String browser) {
		try {
		if(browser.equalsIgnoreCase("chrome")) {
		
		//System.setProperty("system.ie.browser","//usr//bin//safaridriver");
		driver = new SafariDriver();
		
		
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			
				
				System.setProperty("system.ie.browser","//usr//bin//safaridriver");
				driver = new SafariDriver();
				driver.manage().window().maximize();
				
				}
				
		driver.manage().window().maximize();
		System.out.println("user is able to open "+browser+" browser");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	public static void navigateURL(String URL) {
		try {
		
		driver.get(URL);
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	public static void enterText(String xpath,String enterValue) {
		try {
			driver.findElement(By.xpath(objectXpath.getProperty(xpath))).sendKeys(enterValue);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
public static void clickButton(String xpath) {
	try {
		wait=new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objectXpath.getProperty(xpath))));
		driver.findElement(By.xpath(objectXpath.getProperty(xpath))).click();
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
}
	
	
	
	
	
}