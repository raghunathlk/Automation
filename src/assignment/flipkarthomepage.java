package assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkarthomepage {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
    	  WebDriver driver=new FirefoxDriver();
    	  driver.get("https://www.flipkart.com/");
    	  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
    	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
    	  Thread.sleep(10000);
    	   List<WebElement> d = driver.findElements(By.xpath("//a[@class='_2ja22P']"));
    	   
    	   int c=d.size();
    	   System.out.println(c);
    	   for (WebElement s:d) {
    		   String f=s.getText();
    		   System.out.println(f);
			
		}
    	  System.out.println(d.get(c-2).getText());
    	 WebElement db=d.get(c-1);
    	 db.click();
    	 //  driver.close();
    	  
	}

}
