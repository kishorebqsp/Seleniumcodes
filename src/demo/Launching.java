package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to enter the url of the application
		driver.get("https://www.facebook.com/");
		
		//to get the title of the page
		String t = driver.getTitle();
		System.out.println(t);
		
		//to get the url of the page
		String u = driver.getCurrentUrl();
		System.out.println(u);
		
		//to close the application
		driver.close();

	}

}
