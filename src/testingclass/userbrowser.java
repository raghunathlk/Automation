package testingclass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class userbrowser {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser name:");
		String browser=sc.nextLine();
		WebDriver driver=null;//created the refreance variable to interface of webdriver
		
		if (browser.equals("ff")) {
			String key="webdriver.gecko.driver";
			 String value="./Driver/geckodriver.exe";
			 	System.setProperty(key, value);
			 	driver=new FirefoxDriver();
			
		}
		else if (browser.equals("gc")) {
			String key="webdriver.chrome.driver";
			String value="./Driver/chromedriver.exe";
				System.setProperty(key, value);
				driver=new ChromeDriver();//up casting to the overridden method
			
		}
		Thread.sleep(10000);
		driver.close();//Refer to current running browser

	}

}
