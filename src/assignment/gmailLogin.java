package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	  driver.findElement(By.id("identifierId")).sendKeys("rskamkar@gmail.com");
	  
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		//Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1231456585");
				//b.click();
			

	}

}
