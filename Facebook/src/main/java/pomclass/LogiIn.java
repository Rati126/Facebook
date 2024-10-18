package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogiIn {

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailOrPhone;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login;

	@FindBy (xpath = "//span[text()='Continue']")
	private WebElement clickcon;
	

	
	public LogiIn (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailPhone()
	{
		emailOrPhone.sendKeys("rati.rbag@gmail.com");
	}
	
	public void enterpassword ()
	{
		password.sendKeys("Great@123");
	}
	
	public void login()
	{
		login.click();
	}
	
	
	public void continubutton()
	{
		clickcon.click();
		System.out.println("Hi");
	}
	
	
}
