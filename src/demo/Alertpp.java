package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpp {

	public static void main(String[] args) {
		System.setProperty("webdriver..driver", "./software/chromedriver.exe");
		// opening the browser
		ChromeDriver driver = new ChromeDriver();
		// to enter the url of the appication
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.findElementByXPath("//input[@value='Click here for output>>']").click();
		Alert ele = driver.switchTo().alert();
		String t = ele.getText();
		System.out.println(t);
		ele.accept();
		

	}

}
