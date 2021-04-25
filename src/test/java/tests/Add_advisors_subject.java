package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.AdvisorsSubjectsReader;
import pages.ConsultantSubjects;
import pages.LoginPage;

public class Add_advisors_subject extends TestBase {
	
	ConsultantSubjects Cons_subject ;
	LoginPage Admin ; 
	
	
	@DataProvider(name="ExcelData")
	public Object[][] addSubjectsData() throws IOException
	{
	    AdvisorsSubjectsReader ER = new AdvisorsSubjectsReader();
		return ER.getExcelData();		
	}
	
	@BeforeTest
	public void Admin_login()
	{
		Admin = new LoginPage(driver);
		Admin.login("admin@monshaat.com", "root");
		Cons_subject = new ConsultantSubjects(driver);
		Cons_subject.find_advisorssubjectlink();
		Cons_subject.add_advisor_subject();
		


	}

	
	@Test (priority=1 , alwaysRun=true,dataProvider="ExcelData")
	public void add_subject(String subject_name)
	{
//		Cons_subject = new ConsultantSubjects(driver);
//		Cons_subject.find_advisorssubjectlink();
//		Cons_subject.add_advisor_subject();
//		
	    Cons_subject.save_name(subject_name);
		Cons_subject.add_advisor_subject();
        System.out.println(subject_name);
		
	  

	}

}
