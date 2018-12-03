package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionss {

	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get("https://home.redbrickhealth.com/");
		       WebElement g=driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
		     
		       
			Actions act= new Actions(driver);
			
			act.moveToElement(g).perform(); 
			 List<WebElement> e = driver.findElements(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']/..//a[@class='nav-link']"));
			 int count=e.size();
			 System.out.println(count);
			 for (WebElement webElement : e) {
				 String text=webElement.getText();
				 System.out.println(text);
				
			}
			
			 Thread.sleep(1000);
			 driver.close();
	}

}
