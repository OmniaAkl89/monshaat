package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddSlotsPage;
import pages.LoginPage;

public class AddSlotsTest extends TestBase {
	

	LoginPage Admin ; 
	AddSlotsPage OpenConsultants;
	
	@BeforeTest
	public void Admin_login() throws InterruptedException
	{
		Admin = new LoginPage(driver);
		Admin.login("admin@monshaat.com", "root");
		OpenConsultants =new AddSlotsPage(driver);
		OpenConsultants.find_ConsultantsPage();
	}
	
	@Test
	public void open_ConsultantRow()
	{
		
		OpenConsultants.click_ConsultantRow(1);
		
	}
		


}

