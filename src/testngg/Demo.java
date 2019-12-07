package testngg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority=1,invocationCount=3)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(priority=-1,enabled=false)
	public void settings()
	{
		Reporter.log("settings",true);
	}
	
	@Test(priority=2)
	public void chats()
	{
		Reporter.log("chats",true);
	}
	
	


}
