package testingclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sync {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
   	  WebDriver driver=new FirefoxDriver();
   	  driver.manage().window().maximize();
   	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	  driver.get("https://demo.actitime.com/login.do");
   	  driver.findElement(By.id("username")).sendKeys("admin");
   	  driver.findElement(By.name("pwd")).sendKeys("manager");
   	  driver.findElement(By.xpath("//div[.='Login ']")).click();
   	  
	}

}
