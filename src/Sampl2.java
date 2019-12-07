import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampl2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		//opening the browser
		ChromeDriver driver=new ChromeDriver();
		//to enter the url of the appication
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElementByName("birthday_month");
	 //driver.findElementByXPath("//option[.='Jan']").click();
		
		Select s=new Select(ele);
		s.selectByIndex(11);
		Thread.sleep(3000);
		s.selectByValue("4");
		Thread.sleep(3000);
		s.selectByVisibleText("Feb");
		boolean m = s.isMultiple();
		System.out.println(m);
		

	}

}
