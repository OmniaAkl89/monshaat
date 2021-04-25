package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsultantSubjects extends PageBase {

	public ConsultantSubjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (className = "kt-menu__nav")
	WebElement main_menu;
	
	@FindBy(partialLinkText = "اضافه مجال استشارى")
	WebElement add_subject_btn;
	
	@FindBy(partialLinkText = "اضافه مجال ارشادي")
	WebElement add_advisor_subject_btn;
	
	
	@FindBy(name = "subject")
	public WebElement consultantsubject_name;
	
	@FindBy(xpath = "//*[@id=\"kt_content\"]/div[2]/div/div/form/div[2]/button")
	WebElement save_btn;
	
	
	public void add_consultant_subject()
	{
		add_subject_btn.click();
	}
	
	public void add_advisor_subject()
	{
		add_advisor_subject_btn.click();
	}
	
	public void save_name(String subjectname)
	
	{
		consultantsubject_name.sendKeys(subjectname);
		save_btn.click();
	}
	
	
	
	public void find_subjectlink()
	{
		List<WebElement> menu_options=main_menu.findElements(By.tagName("li"));
		for (WebElement li : menu_options) {
		if (li.getText().equals("مجالات")) {
		     li.click();
       WebElement subjectslist = li.findElement(By.className("kt-menu__subnav"));
	     List<WebElement> All_subjects_types =subjectslist.findElements(By.tagName("li"));
				for (WebElement list_item : All_subjects_types) {
				if (list_item .getText().equals("مجالات استشارية")) {
					list_item .click();
				}
				}
		     
		   }
		}
	}
	
	public void find_advisorssubjectlink()
	{
		List<WebElement> menu_options=main_menu.findElements(By.tagName("li"));
		for (WebElement li : menu_options) {
		if (li.getText().equals("مجالات")) {
		     li.click();
       WebElement subjectslist = li.findElement(By.className("kt-menu__subnav"));
	     List<WebElement> All_subjects_types =subjectslist.findElements(By.tagName("li"));
				for (WebElement list_item : All_subjects_types) {
				if (list_item .getText().equals("مجالات ارشادية")) {
					list_item .click();
				}
				}
		     
		   }
		}
	}

}
