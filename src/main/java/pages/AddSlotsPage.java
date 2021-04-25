package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSlotsPage extends PageBase{

	public AddSlotsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy (className = "kt-menu__nav")
	WebElement main_menu;
	
	WebElement TableRow;
	WebElement RowCell;
	
	
	public void find_ConsultantsPage()
	{
		List<WebElement> menu_options=main_menu.findElements(By.tagName("li"));
		for (WebElement li : menu_options) {
		if (li.getText().equals("مقدمين الخدمة")) {
		     li.click();
       WebElement consultantslist = li.findElement(By.className("kt-menu__subnav"));
	     List<WebElement> All_subjects_types = consultantslist.findElements(By.tagName("li"));
				for (WebElement list_item : All_subjects_types) {
				if (list_item .getText().equals("المستشارين")) {
					list_item .click();
				}
				}
		     
		   }
		}
	}
	
	public void click_ConsultantRow(int x)
	{
		WebElement table=driver.findElement(By.xpath("//*[@class=\"jss164\"]/table/tbody/tr[1]"));
	//	List<WebElement> tableItems = table.findElements(By.className("MuiTableBody-root"));
		
		//String path = "//*[@id=\"kt_content\"]/div[2]/main/div/div/div/table/tbody/tr[2]";
	//	TableRow = table.findElement(By.xpath("//*[@id=\"kt_content\"]/div[2]/main/div/div/div/table/tbody/tr[1]"));
	//	tableItems.get(1).click();
	}

}
