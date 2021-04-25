package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath= "//*[@id=\"kt_login\"]/div/div/div/div/form/div[2]/div/div/input")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"kt_login\"]/div/div/div/div/form/div[3]/div/div/input")
	WebElement password;
	
	@FindBy(id = "kt_login_signin_submit")
	WebElement login_btn;
	
	public void login(String userName, String Password)
	{
	 	username.sendKeys(userName);
	 	password.sendKeys(Password);
	 	login_btn.click();
	 	
	}

}
