package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitask {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			driver.findElement(By.xpath("//a[@class='content tasks']")).click();
			//driver.findElement(By.xpath("(//div[@class='img'])[5]")).click();
			driver.findElement(By.xpath("//div[.='Backup controlling']/../../..//div[@class='img']")).click();
			driver.findElement(By.xpath("//span[.='Delete']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='deleteTaskPopup_deleteConfirm_submitBtn']/..//div[.='Cancel']")).click();
			Thread.sleep(3000);
			driver.close();
	}

}
