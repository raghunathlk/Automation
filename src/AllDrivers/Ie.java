package AllDrivers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie
{
public static void main(String[] args) throws InterruptedException
{
	String key="webdriver.ie.driver";
	 String value="./Driver/IEDriverServer.exe";
	 	System.setProperty(key, value);
	 	InternetExplorerDriver ie=new InternetExplorerDriver();
	 	Thread.sleep(1000);
		 ie.close();
}
}
