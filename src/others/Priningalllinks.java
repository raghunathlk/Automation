package others;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Priningalllinks {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	     
	    List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	    int count=   alllinks.size();
	    System.out.println("count:"+count);
	    
	for(int i=0;i<count;i++) 
	{
		WebElement d=alllinks.get(i);
		 System.out.println(d);
		 String m = d.getText();
	System.out.println(m);
	}
	   driver.close(); 
	}

}
