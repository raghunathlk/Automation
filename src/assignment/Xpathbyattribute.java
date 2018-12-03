package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathbyattribute {

	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		 	System.setProperty(key, value);
		 	WebDriver f=new FirefoxDriver();
		 	
		 f.get("https://www.facebook.com/");
		 
		 f.findElement(By.xpath("//input[@id='email']")).sendKeys("8197753818");
	}

}
