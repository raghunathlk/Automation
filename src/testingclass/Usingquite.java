package testingclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usingquite {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		
		 	System.setProperty(key, value);
		 	 WebDriver driver=new FirefoxDriver();
		 	 //to manage the window screen 
		 	Options m= driver.manage();
		 	Window w=m.window();
		 	w.maximize();
		 	
		 	
		 	//to enter the url in browser
		 	driver.get("https://www.naukri.com/");
		 	
		 	//to get the title of  the current web page 
		 	String title=driver.getTitle();
		    System.out.println("title: "+title);
		 	
		 	
		 	
		 	
		 	//to get the current webpage url
		 	String url=driver.getCurrentUrl();
		 	System.out.println("current url: "+url);
		 	
		 	
		 	//to close the browser
		 	Thread.sleep(5000);
		 	driver.quit();
		 	
	}

}
