package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launchingbrowser {

	public static void main(String[] args) {
		//Launch Chrome Browser
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();

		//launch Firefox Browser
System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
FirefoxDriver driver1=new FirefoxDriver();
	
		//launch Internet Exploer browser
System.setProperty("webdriver.ie.driver","./software/IEDriverServer.exe");
InternetExplorerDriver driver2=new InternetExplorerDriver();
	}

}
