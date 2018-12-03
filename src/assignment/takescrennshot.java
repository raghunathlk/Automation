package assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescrennshot {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.naukri.com/");

			TakesScreenshot sr=(TakesScreenshot) driver;
			File src=sr.getScreenshotAs(OutputType.FILE);
			File dst = new File("./screenshot.png");
			
			FileUtils.copyFile(src,dst);
			Thread.sleep(3000);
			driver.close();	
	}

}
