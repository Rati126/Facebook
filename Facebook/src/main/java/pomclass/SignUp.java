package pomclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	@FindBy (xpath = "//a[text()='Create new account']")
	private WebElement createNew;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName ;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement surName ;
	
	@FindBy (xpath = "//input[@name='reg_email__']")
	private WebElement mobileNumber;
	
	@FindBy (xpath = "//input[@id='password_step_input']")
	private WebElement newPassword;
	
	@FindBy (xpath = "//select[@id='day']")
	private WebElement date;
	
	@FindBy (xpath = "//select[@id='month']")
	private WebElement month;
	
	@FindBy (xpath = "//select[@id='year']")
	private WebElement yearinInt;
	
	@FindBy (xpath = "//label[text()='Female']")
	private WebElement female;
	
	@FindBy (xpath = "//label[text()='Male']")
	private WebElement male;
	
	@FindBy (xpath = "//label[text()='Custom']")
	private WebElement custom;
	
	@FindBy (xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signUp;
	
	private Actions act;
	
	public SignUp(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	  act = new Actions (driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void clickCreate()
	{
		createNew.click();
	}
	
	public void enterFirstName()
	{
		act.moveToElement(firstName).sendKeys("Rati").build().perform();
	}
		
	public void enterLastName()
	{
		surName.sendKeys("Kajwadkar");
	}
	public void enterMobileNo()
	{
		mobileNumber.sendKeys("7687263716");
	}
	
	public void enterPassword()
	{
		newPassword.sendKeys("Pass@23");
	}
	
	public void dateOfBirth()
	{
		Select select = new Select (date);
		select.selectByIndex(6);
		
		 select = new Select (month);
		select.selectByValue("7");
		
		select = new Select (year);
		select.selectByValue("1987");	
		
		}
	public void selectFemale()
	{
		female.click();
	}
	
}
