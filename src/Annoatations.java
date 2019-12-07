import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annoatations {
	
	@BeforeClass
	public void bclass()
	{
		Reporter.log("BC",true);
		
	}
	@AfterClass
	public void aclass()
	{
		Reporter.log("AC",true);
		
	}
	
	@BeforeTest
	public void btest()
	{
		Reporter.log("BT",true);
		
	}
	
	@AfterTest
	public void Atest()
	{
		Reporter.log("AT",true);
		
	}
	
	@BeforeMethod
	public void bmethod()
	{
		Reporter.log("BM",true);
		
	}
	
	
	
	@AfterMethod
	public void amtest()
	{
		Reporter.log("AM",true);
		
	}
	
	
	@Test
	public void login()
	{
		Reporter.log("Test",true);
		
	}
	@BeforeSuite
	public void suite()
	{
		Reporter.log("BS",true);
	}
	
	@AfterSuite
	public void asuite()
	{
		Reporter.log("AS",true);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	
