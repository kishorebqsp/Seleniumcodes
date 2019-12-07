package demo;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver..driver", "./software/chromedriver.exe");
		// opening the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
//		driver.findElementByXPath("//button[@title='I am a Professional']").click();
//		driver.findElementByName("uploadCV").sendKeys("C:\\Content\\Software Test Lifecycle.docx");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		int count = child.size();
		System.out.println(count);
		for(String b:child)
		{
		driver.switchTo().window(b);
		String tit = driver.getTitle();
		System.out.println(tit);
		}
		System.out.println(child);

	
	driver.close();
	}

}
