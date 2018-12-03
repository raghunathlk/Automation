package others;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class userbrowserr {

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
     System.out.println("enter the brwr name:"); 
      String browser=sc.nextLine();
      WebDriver driver=null; 
      
      if(browser.equals("ff"))
      {
    	  System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		 	driver=new FirefoxDriver();
      }
      else if(browser.equals("gg"))
      {
    	  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
    	  driver=new ChromeDriver();
      }
      driver.close();
	}

}
