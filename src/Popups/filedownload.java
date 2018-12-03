package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class filedownload {

	public static void main(String[] args)
	{
       FirefoxProfile profile=new FirefoxProfile();
       String key1="browser.helperApps.neverAsk.saveToDisk";
		 String value1="application/zip";
		 profile.setPreference(key1, value1);
		 FirefoxOptions opt=new FirefoxOptions();
		 opt.setProfile(profile);

		String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		 	System.setProperty(key, value);
		 	WebDriver driver = new FirefoxDriver(opt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.seleniumhq.org/download/");
			driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	}

}
