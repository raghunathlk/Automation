package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBoxfb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.facebook.com/");
	     //day selection by Index
	    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	    Select d=new Select(day);
	    d.selectByIndex(24);
	    
	    //month selection By value 
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Select m=new Select(month);
	    m.selectByValue("6");
	    
	   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	   
	   //year selection by VisibleText
	    Select y=new Select(year);
	    y.selectByVisibleText("1996");
	    
	   Thread.sleep(10000);
	    driver.close();
	    
	}
}
