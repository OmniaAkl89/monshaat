package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class Login extends TestBase {
	
	LoginPage Admin;
	
	@Test
	public void Admin_login()
	{
		Admin = new LoginPage(driver);
		Admin.login("admin@monshaat.com", "root");
	}

}
