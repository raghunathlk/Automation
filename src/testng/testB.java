package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testB extends testng
{
 	  @Test
	  public void test3() 
	  {
		  Reporter.log(" test3", true);
	  }
	  @Test
	  public void test4() 
	  {
		  Reporter.log(" test4", true);
	  
  }
}
