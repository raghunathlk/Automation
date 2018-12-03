package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivision {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.cleartrip.com");
			//to handle window pop-up
			Robot r=new Robot();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
			driver.findElement(By.id("DepartDate")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='January']/../../..//a[.='26']")).click();
			
			Thread.sleep(2000);
			driver.close();

	}

}
