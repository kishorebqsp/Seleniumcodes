package testng;

import org.testng.annotations.Test;

import lib.Baseclass;

public class Invalidlogi extends Baseclass {
	@Test
	public void password()
	{
		System.out.println("bye");
	}
	
	@Test(priority=1)
	public void pass()
	{
		System.out.println("bye");
	}

}
