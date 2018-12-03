package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import others.webdriver;

public class LoginorSignupPage {
	
	
	
	//declarations
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement surname;
	@FindBy(name="reg_email__")
	private WebElement number;
	@FindBy(name="reg_passwd__")
	private WebElement newpassword;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="//input[@value='1']")
	private WebElement female;
	@FindBy(xpath="//input[@value='2']")
	private WebElement male;
	@FindBy(xpath="//a[contains(@href,'https://www.facebook.com/recover/initiate?lwv')]")
	private WebElement forgottonaccount;
	@FindBy(linkText="Login ")
	private WebElement loginbutton;
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signupbutton;
	
	
	
	//initialization
	public LoginorSignupPage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	//utilization

	public void setUsername(String n)
	{
		username.sendKeys(n);
	}

	public void setPassword(String n) 
	{
		password.sendKeys(n);
	}
	
	public void setFirstname(String n) 
	{
		firstname.sendKeys(n);
	}

	public void setSurname(String n) 
	{
		surname.sendKeys(n);
	}
	
	public void setNewpassword(String n) 
	{
		newpassword.sendKeys(n);
	}

	public void setNumber(String n) 
	{
		number.sendKeys(n);
	}
	public void setDay(int n) 
	{
		Select sel=new Select(day);
	    sel.selectByIndex(n);
	}
	public void setYear(String n) 
	{
		Select sel=new Select(year);
	    sel.selectByVisibleText(n);
	}
	public void setMonth(String n) 
	{
		Select sel=new Select(month);
	    sel.selectByVisibleText(n);
	}
	public void setGender(int n) 
	{
		if(n==1)
		{
			female.click();
		}
		else if(n==2)
		{
			male.click();
		}
	}
	public void setForgottonaccount() 
	{
		forgottonaccount.click();
	}

	public void setLoginbutton() 
	{
		loginbutton.click();
	}

	public void setSignupbutton() 
	{
		signupbutton.click();
	}

	
	


}
