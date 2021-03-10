package pageObjectRepository;	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory99Homepage {
	//used Page Factory design model -- FindBy annotations
		WebDriver driver;
			
		public PageFactory99Homepage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath = "//input[@valtype='keyword']")
		WebElement txtKeyword;
		
		@FindBy(id = "submit-query")
		WebElement btnSubmit;
		
		public WebElement gettxtKeyword()
		{
			return txtKeyword;
		}
		
		public WebElement getbtnSubmit()
		{
			return btnSubmit;
		}
}
