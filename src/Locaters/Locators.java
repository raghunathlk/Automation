package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Windows/Desktop/sample.html");
		
		/*driver.findElement(By.id("fp1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
	     driver.findElement(By.name("xyz1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		driver.findElement(By.className("pass")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		driver.findElement(By.linkText("inbox1(20)")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		driver.findElement(By.partialLinkText("inbox1")).click();
		Thread.sleep(1000);
		driver.navigate().back();*/
		
		
		driver.findElement(By.id("mno")).sendKeys("ram");
		driver.findElement(By.id("op")).sendKeys("Xyz");
	    driver.findElement(By.id("fp2")).click();
		
		
	}

}
