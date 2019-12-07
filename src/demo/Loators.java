package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//eneter the url of the application
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_m")).sendKeys("zyr");
		driver.findElement(By.name("lastname")).sendKeys("tfgghghhhg");
		
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("5656676767676");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jhcggahgh");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
	}

}
