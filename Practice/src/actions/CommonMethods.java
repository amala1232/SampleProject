package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;

import utility.CommonObjects;

public class CommonMethods extends CommonObjects{
	
	public static void executeKeywords(String testName) {
		int rowCount=xls.getRowCount("Test Steps");
		for(i=2;i<=rowCount;i++) {
			if((xls.getCellData("Test Steps", "TCID", i)).equalsIgnoreCase(testName)) {
				runMode=xls.getCellData("Test Steps", "Runmode", i);
				action=xls.getCellData("Test Steps", "Action", i);
				objData=xls.getCellData("Test Steps", "Object", i);
				textData=xls.getCellData("Test Steps", "Data", i);
				proceedIfFails=xls.getCellData("Test Steps", "Proceediffails", i);
				if(runMode.equalsIgnoreCase("Y")) {
					if(action.equalsIgnoreCase("openBrowser"))
						result=openBrowser();
					if(action.equalsIgnoreCase("navigateURL"))
						result=navigateURL();
					if(action.equalsIgnoreCase("enterText"))
						result=enterText(objData);
					//if(action.equalsIgnoreCase("clickButton"))
					//	result=clickButton(objData);
					
				}
				
				reporting();
			}
			
		}
	}
	public static void reporting() {
		try {
			results=result.split("-");
			xls.setCellData("Test Steps", "Results", i, results[0]);
			xls.setCellData("Test Steps", "comments", i, results[1]);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String openBrowser() {
		try {
		System.setProperty("system.ie.browser","//usr//bin//safaridriver");
		driver = new SafariDriver();
		driver.manage().window().maximize();
		excelData="PASS-user is able to open s browser";
		return excelData;
		}
		catch(Exception e) {
			e.printStackTrace();
			excelData="Fail-user is not able to open s browser";
			return excelData;
		}
	}
	
	public static String navigateURL() {
		try {
		String URL=xls.getCellData("Config", "URL", 2);
		driver.get(URL);
		excelData="PASS-user is able to launcg the application";
		return excelData;
		}
		catch(Exception e) {
			e.printStackTrace();
			excelData="Fail-user is not able to launcg the application";
			return excelData;
		}
	}
	public static String enterText(String xpath) {
		try {
			driver.findElement(By.xpath(objectXpath.getProperty(xpath))).click();
			excelData="PASS-user is able to enter a text in text field";
		return excelData;
		}
		
		catch(Exception e) {
			e.printStackTrace();
			excelData="Fail-user is not able to enter a text in text field";
			return excelData;
		}
	}
/*public static String clickButton(String xpath) {
	try {
		driver.findElement(By.xpath(objectXpath.getProperty(xpath))).click();
		excelData="PASS-user is able to click a search button";
		return excelData;
	}catch(Exception e) {
		e.printStackTrace();
		excelData="Fail-user is not able to click a search button";
		return excelData;
	}
}*/

}
