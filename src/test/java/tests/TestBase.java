package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
public static WebDriver driver;
	
	
	@BeforeSuite
	public void startDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//driver.navigate().to("https://cb-demo-dashboard.monshaat.sa/");
		driver.navigate().to("https://fesmea-bc.ibtikar.sa");
	}
	
	
//	@AfterSuite
//	public void endDriver()
//	{
//		
//		driver.quit();
//	}
	
	
	public void clickEnter()
	{
		Actions action =new Actions(driver);
		action.sendKeys(Keys.ENTER);
		action.perform();
	}
	
	public void clickEscape()
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.perform();
	}

}
