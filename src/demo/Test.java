package demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./software/msedgedriver.exe");
		//opening the browser
		EdgeDriver driver=new EdgeDriver();
		//to enter the url of the appication
		driver.get("https://demo.actitime.com/login.do");
		//to enter the valid username
		WebElement ele = driver.findElementById("username");
		ele.sendKeys("admin");
		//to get the text 
		String t = ele.getText();
		System.out.println(t);
		driver.close();

	}

}
