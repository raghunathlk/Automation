package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultpl {

	public static void main(String[] args)
	{
		String key="webdriver.gecko.driver";
		String value="./Driver/geckodriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/Windows/Desktop/dropdownlist.html");
			WebElement hotel= driver.findElement(By.id("maarya"));
			Select sel=new Select(hotel);
			
			if(sel.isMultiple())
			{
				System.out.println(" is multi select");
			}
			else
			{
				System.out.println("single select");
			}
			
			driver.close();
			

	}

}
