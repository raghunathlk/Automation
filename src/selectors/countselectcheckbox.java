package selectors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class countselectcheckbox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/Windows/Desktop/select.html");
	    List<WebElement> allcb = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    int	count=allcb.size();
	    System.out.println("size:"+count);
	  
	    //reverse seslection of check box
	    //for(int i=count-1;i>=0;i--)
		//   {
			//  WebElement d = allcb.get(i);
			  //d.click();
			  //String m=d.getText();
			 // System.out.println(m);
		//   }
	    
	    
	   for(int i=0;i<count;i++)
		   
	   {
		   if((i%2)!=0) {
		  WebElement d = allcb.get(i);
		  d.click();
		  String m=d.getText();
		  System.out.println(m);
		   }
	   }
	   
	   //
	  //driver.close();
	} 
	

}
  

