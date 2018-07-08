package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Xls_Reader.Xls_Reader;
import actions.CommonMethods;

public class TestCase002 extends CommonMethods{

	@Test
	public static void search() {
		try {
			executeKeywords("TestCase002");
			//clickLink("Todays_Btn");
			//main("Mail");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	//openBrowser();
	//navigateURL("https://www.amazon.com/");
	//enterText(objectXpath.getProperty("Search_Data"),xls.getCellData("TestCase1","search_data", 2));
	//clickButton(objectXpath.getProperty("Go_Btn"));

	}
	@BeforeTest
	public static void excelInvoke() throws Throwable{
		 xls=new Xls_Reader("//Users//rakesh//amala folder//Practice//src//configData//TestCase001.xlsx");
	  objectXpath=new Properties();
	  FileInputStream fs=new FileInputStream(new File("//Users//rakesh//amala folder//AmazonSprintOne//src//ConfigData//ObjectRepo.properties"));
	objectXpath.load(fs);
	
	}
	@AfterTest
	public static void tearDown() {
		//clickLink("Todays_Btn");
		//closeBrowser();
	}
}
