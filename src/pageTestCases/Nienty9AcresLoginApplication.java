package pageTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectRepository.Nienty9AcresLoginpage;

public class Nienty9AcresLoginApplication {
		
	WebElement txtUsername, txtPassword, btnLogin;
	
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Nivedha\\Selenium\\Sel1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.99acres.com/property/loginpage.php");
		driver.manage().window().maximize();
		
		Nienty9AcresLoginpage LoginObject = new Nienty9AcresLoginpage(driver);
		
		txtUsername = LoginObject.getUsername();
		txtUsername.sendKeys("niv@gmail.com");
		
		txtPassword = LoginObject.getPassword();
		txtPassword.sendKeys("admin");
		
		btnLogin = LoginObject.getLogin();
		btnLogin.click();
		
		
		
	}
}
