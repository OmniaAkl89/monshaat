package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
protected WebDriver driver ;
public JavascriptExecutor jse;

	
	public PageBase(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

}
