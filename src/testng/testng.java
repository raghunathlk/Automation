package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testng 
{
	@BeforeMethod
	  public void testB() 
	  {
		  Reporter.log("method testB", true);
	  }
	@AfterMethod
	  public void testC() 
	  {
		  Reporter.log("method testC", true);
	  }
	@BeforeClass
	  public void testD() 
	  {
		  Reporter.log("class testD", true);
	  }
	@AfterClass
	  public void testE() 
	  {
		  Reporter.log("class testE", true);
	  }

	@BeforeTest
	  public void testF() 
	  {
		  Reporter.log("test testF", true);
	  }
	@AfterTest
	  public void testG() 
	  {
		  Reporter.log("test testG", true);
		  
	  }
	@BeforeSuite
	  public void testH() 
	  {
		  Reporter.log("Suite testH", true);
	  }
	@AfterSuite
	  public void testI() 
	  {
		  Reporter.log("Suite testI", true);
	  }
}
