package AllDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome
{
public static void main(String[] args) throws InterruptedException
{  
	String key="webdriver.chrome.driver";
String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver cd=new ChromeDriver();
	 Thread.sleep(1000);
	 cd.close();
}
}
