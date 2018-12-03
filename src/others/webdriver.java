package others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.google.com/");
       
     String  j= driver.getCurrentUrl();
       System.out.println(j);
       
       String s=driver.getTitle();
       System.out.println(s);
       
       driver.navigate().to("https://www.facebook.com/");
       
      // driver.navigate().to("https://www.naukri.com/");
      // driver.get("https://www.google.com/search?q=chandragutti&client=firefox-b-ab&tbm=isch&source=iu&ictx=1&fir=4cUq_b2P5myR2M%253A%252CswMB-8bItRnAKM%252C_&usg=AI4_-kRXrBQy5TEc3fm38REp7JiJNr_UBQ&sa=X&ved=2ahUKEwjD0Lnf-NbeAhVERo8KHTCnD_YQ9QEwAXoECAUQBA#imgrc=4cUq_b2P5myR2M:");
      // driver.navigate().back();
       driver.findElement(By.cssSelector("input[type='email']")).sendKeys("8197753818");
       driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("raamashri");
       driver.findElement(By.id("u_0_3")).click();
       Thread.sleep(1000);
       // driver.quit();
       
	}
}
