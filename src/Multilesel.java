import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multilesel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		//opening the browser
		ChromeDriver driver=new ChromeDriver();
		//to enter the url of the appication
		driver.get("file:///C:/Users/HP/Desktop/bharani_profile/dropdown.html");
		WebElement e = driver.findElementById("month");
		Select s=new Select(e);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("Jan");
		Thread.sleep(3000);
	WebElement option = s.getFirstSelectedOption();
		int count = option.size();
		System.out.println(count);
		for(WebElement b:option)
		{
			String t = b.getText();
			System.out.println(t);
		}
		
	
		if(s.isMultiple())
		{
			//s.deselectAll();
			s.deselectByVisibleText("Jan");
		}
		else
		{
			System.out.println("it s single selct drop down");
		}
		
	}

}
