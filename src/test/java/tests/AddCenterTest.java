package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.CentersReader;
import pages.LoginPage;
import pages.AddCentersPage;

public class AddCenterTest extends TestBase{
	
	LoginPage Admin;
	AddCentersPage newCenter;
	
	@DataProvider(name="ExcelData")
	public Object[][] addSubjectsData() throws IOException
	{
	    CentersReader ER = new CentersReader();
		return ER.getExcelData();		
	}
	
	@BeforeTest
	public void Admin_login() throws InterruptedException
	{
		Admin = new LoginPage(driver);
		Admin.login("admin@monshaat.com", "root");
		newCenter = new AddCentersPage(driver);
        newCenter.openCentersList();
		newCenter.openCenterForm();
		
	}
	
	@Test (priority=1 , alwaysRun=true,dataProvider="ExcelData")
	public void addNewCenter(String name ,String Address , String lat , String longitude) throws InterruptedException 
	{
	

		
		newCenter.fillCenterInfo(name, Address, lat,longitude);
		//Thread.sleep(10000);
	    newCenter.openCitiesList();
        clickEnter();
		//Thread.sleep(10000);
		newCenter.saveCenter();
		Thread.sleep(10000);
		newCenter.openCenterForm();
	}

}
