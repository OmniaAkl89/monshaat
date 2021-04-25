package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCentersPage extends PageBase {

	public AddCentersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (className = "kt-menu__nav")
	WebElement main_menu;
	
	@FindBy(partialLinkText = "اضافه مركز")
	WebElement add_center_btn;
	
	@FindBy(xpath="//*[@id=\"kt_content\"]/div[2]/div/form/div[2]/div/div[1]/div/div/input")
	WebElement centerName;
	
	@FindBy(xpath="//*[@id=\"kt_content\"]/div[2]/div/form/div[2]/div/div[2]/div/div/input")
	WebElement centerAddress;
	
	@FindBy(xpath="//*[@id=\"demo-simple-select\"]")
	WebElement centerCity;
	
	@FindBy(xpath="//*[@id=\"kt_content\"]/div[2]/div/form/div[2]/div/div[4]/div[1]/div[1]/div/div/input")
	WebElement centerLatitude;
	
	@FindBy(xpath="//*[@id=\"kt_content\"]/div[2]/div/form/div[2]/div/div[4]/div[1]/div[2]/div/div/input")
	WebElement centerLongitude;
	
	@FindBy(xpath="//*[@id=\"kt_content\"]/div[2]/div/form/button")
	WebElement saveCenter;
	
	public void openCentersList()
	{
		List<WebElement> menu_options=main_menu.findElements(By.tagName("li"));
		for (WebElement li : menu_options) {
		if (li.getText().equals("اماكن منشأت")) {
		     li.click();
       WebElement subjectslist = li.findElement(By.className("kt-menu__subnav"));
	     List<WebElement> All_subjects_types =subjectslist.findElements(By.tagName("li"));
				for (WebElement list_item : All_subjects_types) {
				if (list_item .getText().equals("مراكز منشأت")) {
					list_item .click();
				}
				}
		     
		   }
		}
	}
	
	public void openCenterForm()

	{
		add_center_btn.click();
	}
	
	public void openCitiesList()
	{
		centerCity.click();
	}
	
	public void fillCenterInfo(String name , String address , String latitude , String Longitude)
	{
		centerName.sendKeys(name);
		centerAddress.sendKeys(address);
		centerLatitude.sendKeys(latitude);
		centerLongitude.sendKeys(Longitude);
	}
	
	public void saveCenter()
	{
		saveCenter.click();
	}
}
