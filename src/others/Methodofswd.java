package others;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methodofswd {

	public static void main(String[] args) 
	{

		 String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		 	System.setProperty(key, value);
		 	WebDriver driver =new FirefoxDriver();
		 	
		 	driver.manage().window().maximize();
		 //get
		 driver.get("https://www.flipkart.com/");
		 
		 
		 //gettitle
		 String s=driver.getTitle();
		 System.out.println("title" + s);
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	//url	  
	String c= driver.getCurrentUrl();
	System.out.println("URL"+c);
	 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.quit();
	
	
	
	
	
	
	}

	private static void navigate() {
		// TODO Auto-generated method stub
		
	}

}
