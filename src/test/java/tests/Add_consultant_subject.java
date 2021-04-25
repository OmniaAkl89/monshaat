package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ConsultantSubjectsReader;
import pages.ConsultantSubjects;
import pages.LoginPage;

public class Add_consultant_subject extends TestBase {
	
	ConsultantSubjects Cons_subject ;
	LoginPage Admin ; 
	
	
	@DataProvider(name="ExcelData")
	public Object[][] addSubjectsData() throws IOException
	{
	    ConsultantSubjectsReader ER = new ConsultantSubjectsReader();
		return ER.getExcelData();		
	}
	
	@BeforeTest
	public void Admin_login()
	{
		Admin = new LoginPage(driver);
		Admin.login("admin@monshaat.com", "root");
		Cons_subject = new ConsultantSubjects(driver);
		Cons_subject.find_subjectlink();
		Cons_subject.add_consultant_subject();
	
		
	}

	
	@Test (priority=1 , alwaysRun=true,dataProvider="ExcelData")
	public void add_subject(String subject_name) throws InterruptedException
	{
		
	 Cons_subject.save_name(subject_name);
	 Thread.sleep(10000);
	 Cons_subject.add_consultant_subject();

	}

}
