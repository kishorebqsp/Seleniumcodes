package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 {
	@Test(priority=-1)
	public void calls() {
		Reporter.log("calls",true);
	}

}
