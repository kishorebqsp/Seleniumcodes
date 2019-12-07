import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Imp {

	public static void main(String[] args) {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		//opening the browser
		ChromeDriver driver=new ChromeDriver();
		//to enter the url of the appication
		driver.get("https://demo.actitime.com/login.do");
		WebDriverWait w=new WebDriverWait(driver,2);
		//to enter the valid username
//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		
		WebElement ele = driver.findElementById("username");
		w.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("admin");
		
//		WebElement btn = driver.findElementByXPath("//div[.='Login ']");
//		w.until(ExpectedConditions.elementToBeClickable(btn));
//		btn.click();
		
		w.until(ExpectedConditions.elementToBeClickable(ByXPath("//div[.='Login ']"))).click();
		
		//to enter the valid password
	}

	private static By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
