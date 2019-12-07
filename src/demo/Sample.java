package demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		//opening the browser
		ChromeDriver driver=new ChromeDriver();
		//to enter the url of the appication
		driver.get("https://demo.actitime.com/login.do");
		//to enter the valid username
		driver.findElementById("username").sendKeys("admin");
		//to enter the valid password
		driver.findElementByName("pwd").sendKeys("manager");
		//clickon login button
		WebElement ele = driver.findElementByXPath("//div[.='Login ']");
	ele.
		Thread.sleep(5000);	
		//title f the application
		String t = driver.getTitle();
		System.out.println(t);
		//verfication
		
		if(t.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("pass:home page is displayed");
		}
		else
		{
			System.out.println("Fail: home page is not displayed");
		}
		//url of the appication
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElementById("logoutLink").click();
		
		driver.close();
		
	}

}
