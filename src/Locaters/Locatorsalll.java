package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorsalll {

	public static void main(String[] args)
	{
		 String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		 	System.setProperty(key, value);
		 	WebDriver driver =new FirefoxDriver();
		 	
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.xpath("//input[@id='email']")).click();
		 	//sendKeys("8197753818");
		 	driver.findElement(By.name("pass")).sendKeys("raamashri");
	}

}
