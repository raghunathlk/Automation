package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jvascriptConformation {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
			driver.findElement(By.id("loginbutton")).click();
			Alert act=driver.switchTo().alert();
			
			System.out.println(act.getText());
		
			act.accept();
			act.dismiss();
			Thread.sleep(2000);
			driver.close();

	}

}
