package pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AddRolePage extends PageBase {

	public AddRolePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		jse = (JavascriptExecutor) driver;


	}
	
	
	
	@FindBy (className = "kt-menu__nav")
	WebElement main_menu;
	
	@FindBy(partialLinkText="اضافة دور للمتحكم")
	WebElement add_role_btn;
	
	@FindBy(className = "MuiInputBase-input")
	WebElement RoleName;
	
	@FindBy(className = "css-yk16xz-control")
	//@FindBy(className = "css-1pahdxg-control")
	WebElement RolesListDDL;
	
//	@FindBy(className = "css-263lqy-menu")
//	WebElement 
	
	@FindBy(xpath = "//*[@id=\"kt_content\"]/div[2]/form/button")
	WebElement saveBtn;
	
//	@FindBy(className = "css-26l3qy-menu")
//	WebElement listDiv;
	
	//@FindBy(className = " css-11unzgr")
	//WebElement elementsDiv;
	
	

	
	
	public void openRolePage()
	{
		List<WebElement> menu_options=main_menu.findElements(By.tagName("li"));
		for (WebElement li : menu_options) {
		if (li.getText().equals("ادوار المتحكمين")) {
		     li.click();
		}
		}
		
	}
	
	public void addRole()
	{
		add_role_btn.click();
	}
	
	public void enterRoleName(String role_name)
	{
	   RoleName.sendKeys(role_name);
	}
	

	public void selectFromRoleList() throws InterruptedException
	
	{
		RolesListDDL.click();		
		Thread.sleep(10000);
	
		
	}
	
	public void saveRole()
	{
		saveBtn.click();
	}

}
