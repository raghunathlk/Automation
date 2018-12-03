package AllDrivers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire {
	public static void main(String[] args) throws InterruptedException 
	{
		 String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		 	System.setProperty(key, value);
		 	FirefoxDriver f=new FirefoxDriver();
		 	Thread.sleep(5000);
		 	f.close();
	System.out.println("namste");	
	}


}
