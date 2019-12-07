package testng;

import org.testng.annotations.Test;

import lib.Baseclass;

public class Validlogin extends Baseclass{
	@Test
	public void username()
	{
		System.out.println("username");
	}
	
	@Test(priority=1)
	public void user()
	{
		System.out.println("user");
	}

}
