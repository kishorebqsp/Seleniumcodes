package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderpp {

	public static void main(String[] args) {
		System.setProperty("webdriver..driver", "./software/chromedriver.exe");
		// opening the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("(//a[.='19'])[1]")).click();

	}

}
