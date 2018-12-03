package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginorSignupTest {

	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			LoginorSignupPage ls=new LoginorSignupPage(driver);
			ls.setUsername("xyz");
			ls.setPassword("1235ssd");
			ls.setFirstname("shashwat");
			ls.setSurname("chandraguthi");
			ls.setNumber("123456789");
			ls.setNewpassword("hnmsaghngasnhxc54");
			ls.setDay(20);
			ls.setMonth("Jun");
			ls.setYear("2000");
			ls.setGender(2);
			Thread.sleep(3000);
			driver.close();
			
	}

}
