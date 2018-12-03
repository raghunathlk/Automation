package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathbytext {

	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		 	System.setProperty(key, value);
		 	WebDriver driver=new FirefoxDriver();
		 	driver.get("https://www.google.com/search?q=google&ie=utf-8&oe=utf-8&client=firefox-b");
		 	driver.navigate().to("https://www.seleniumhq.org/download/");
		 	
		 	driver.findElement(By.xpath("//td[.='Ruby']/../td[4]"));
		 	driver.findElement(By.xpath("(//a)[1]")).click();
		 
	}	

	

}
