package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageTestCases.Nienty9AcresLoginApplication;

public class Nienty9AcresLoginpage {
	//used by-locator to store elements 
	WebDriver driver;
		
	public Nienty9AcresLoginpage(WebDriver driver)
	{
		this.driver = driver;	
	}
	
	By txtUsername = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin= By.cssSelector("input[value='Login >>']");
	
	public WebElement getUsername()
	{
		return driver.findElement(txtUsername);
	}
	public WebElement getPassword()
	{
		return driver.findElement(txtPassword);
	}
	public WebElement getLogin()
	{
		return driver.findElement(btnLogin);
	}
}
