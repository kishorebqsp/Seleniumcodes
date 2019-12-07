package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("sdfghjghghghghjhhjhjh");
		Thread.sleep(3000);
		ele.clear();
//		int x = ele.getLocation().getX();
//		System.out.println(x);
//		int y=ele.getLocation().getY();
//		System.out.println(y);;
//		int h = ele.getSize().getHeight();
//		System.out.println(h);
//		int w = ele.getSize().getWidth();
//		System.out.println(w);

	}

}
