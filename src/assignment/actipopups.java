package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actipopups {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
			driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
			WebElement text = driver.findElement(By.xpath("//span[.='(build 40469)']"));
			
			String t1=text.getText();
			System.out.println(t1);
			driver.close();
			
	}

}
