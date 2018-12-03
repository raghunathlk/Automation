package testingclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigat {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		
		 	System.setProperty(key, value);
		 	 WebDriver driver=new FirefoxDriver();
		 	 //to manage the window screen 
		 	Options m= driver.manage();
		 	Window w=m.window();
		 	w.maximize();
		 	driver.get("https://www.facebook.com/");
		 	Thread.sleep(1000);
			 
		 driver.navigate().to("https://www.google.com/");
		 Thread.sleep(1000);
		 
		 driver.navigate().back();
		 Thread.sleep(1000);
		 
		 driver.navigate().forward();
		 Thread.sleep(1000);
		 
		 driver.navigate().refresh();
		 Thread.sleep(1000);
		 
		 driver.close();
	}

}
