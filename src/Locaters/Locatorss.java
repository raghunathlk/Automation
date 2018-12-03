package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorss {

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     
    // driver.navigate().to("https://www.facebook.com/");
     
    
     
    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("8197753818");
    driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("raamashri");
    //driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate?lwv')]")).click();;
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.navigate().back();
	driver.close();
	}
}
