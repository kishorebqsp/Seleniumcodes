package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(priority=-1)
	public void chats() {
		Reporter.log("chats",true);
	}
	
	@Test(priority=-1)
	public void settings()
	{
		Reporter.log("settings",true);
	}
	
	@Test
	public void block()
	{
		Reporter.log("block",true);
	}

}
