package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddRolePage;
import pages.ConsultantSubjects;
import pages.LoginPage;

public class AddRoleTest extends TestBase {
	
	LoginPage Admin ; 
	AddRolePage NewRole ;
	
	@BeforeTest
	public void Admin_login() throws InterruptedException
	{
		Admin = new LoginPage(driver);
		Admin.login("admin@monshaat.com", "root");
		NewRole = new AddRolePage(driver);
		NewRole.openRolePage();
		NewRole.addRole();
		Thread.sleep(1000);
		
		
	}
	
	
	@Test
	public void addRole() throws InterruptedException
	{
		NewRole.enterRoleName("Test");
		Thread.sleep(1000);

		NewRole.selectFromRoleList();
		clickEnter();
		Thread.sleep(1000);

		clickEscape();
		NewRole.saveRole();
		
	}


}
