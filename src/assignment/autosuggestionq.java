package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggestionq {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.google.com/");
	     driver.findElements(By.xpath("//input[@class='gLFyf gsfi']"));
	     List<WebElement> allsugestion = driver.findElements(By.xpath("//input[@class='gLFyf gsfi']"));
	}

}
