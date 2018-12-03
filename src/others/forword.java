package others;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forword {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Windows/Desktop/select.html");
			List<WebElement> alllink = driver.findElements(By.xpath("//input[@type='checkbox']"));
			int count=alllink.size();
			System.out.println(count);
			for (int i =0; i < count; i++) {
				
			 WebElement cd = alllink.get(i);
				cd.click();
				Thread.sleep(1000);
				
			}
			/*for (WebElement webElement : alllink) {
				
				webElement.click();
				Thread.sleep(1000);
				
			}*/
			 Thread.sleep(1000);
			 //driver.close();
	}

}
