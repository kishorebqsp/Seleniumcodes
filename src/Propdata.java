import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class Propdata {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
//		String url = p.getProperty("url");
//		driver.get(url);
		driver.get(p.getProperty("url"));
		Thread.sleep(2000);
		driver.findElementById("username").sendKeys(p.getProperty("username"));
		Thread.sleep(2000);
		driver.findElementByName("pwd").sendKeys(p.getProperty("password"));
		Thread.sleep(2000);
		driver.findElementByXPath("//div[.='Login ']").click();
		driver.close();
		

	}

}
