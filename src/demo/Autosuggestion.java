package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(3000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct123']"));
		int count = ele1.size();
		System.out.println(count);
		Thread.sleep(3000);
		for(WebElement b:ele1)
		{
			String t = b.getText();
			System.out.println(t);
		}

	
driver.quit();
	}
}
