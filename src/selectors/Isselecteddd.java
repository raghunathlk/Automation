package selectors;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isselecteddd
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     
	     driver.get("file:///C:/Users/Windows/Desktop/select.html");
	     
	     WebElement s = driver.findElement(By.xpath("(//td[.='B:'])[1]"));
	    Dimension n = s.getSize();
	    
	    System.out.println("size"+n);
	     
	   int l = n.getHeight();
	   int  w =n.getWidth();
	   System.out.println(l);
	   System.out.println(w);
	      //driver.close();
	      Thread.sleep(2000);
	   if(s.isDisplayed())
	      {
	    	  System.out.println("present");
	      }
	      else
	      {
	    	 System.out.println("notpresent");
	}
	   Thread.sleep(2000);
	   
	   
	      WebElement cd = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	      cd.click();
	      if(cd.isSelected())
	      { 
	    	  System.out.println("selected");
	      }
	      else 
	      {
	    	  System.out.println("notselected");
	      }
	      driver.close(); 
	      
	      }
	    	  
		
	}


