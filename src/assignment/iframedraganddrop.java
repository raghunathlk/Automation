package assignment;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class iframedraganddrop {

	public static void main(String[] args) throws InterruptedException
	{ 
		String key="webdriver.gecko.driver";
		 String value="./Driver/geckodriver.exe";
		 	System.setProperty(key, value);
		 	FirefoxDriver driver=new FirefoxDriver();
		 	/*f.switchTo().frame(0);
			 
		 WebElement src = driver.findElement(By.id("draggable"));
		 f.switchTo().frame(0);
		 
		WebElement dst = driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src,dst);
		
		Thread.sleep(1000);*/
		//f.close();
	}

}
