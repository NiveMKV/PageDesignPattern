package pageTestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjectRepository.Nienty9AcresLoginpage;
import pageObjectRepository.PageFactory99Homepage;

public class PageFactory99homeApplication {
	
	WebElement txtKeyword, btnSubmit;
	
	@Test
	public void Homepage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Nivedha\\Selenium\\Sel1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.99acres.com/");
		driver.manage().window().maximize();
		
		PageFactory99Homepage HomeObject = new PageFactory99Homepage(driver);
		
		txtKeyword= HomeObject.gettxtKeyword();
		txtKeyword.sendKeys("chandigarh");

		//Actions actions = new Actions(driver);
		//actions.moveToElement(txtKeyword).sendKeys("chandigarh").build().perform();
		//actions.sendKeys(txtKeyword, "chandigarh").build().perform();
		
		btnSubmit= HomeObject.getbtnSubmit();
		btnSubmit.click();
		
	}
}
