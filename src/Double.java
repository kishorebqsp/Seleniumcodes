import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver", "./software/chromedriver.exe");
		// opening the browser
		ChromeDriver driver = new ChromeDriver();
		// to enter the url of the appication
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement src = driver.findElementByXPath("//h1[.='Block 1']");
		Thread.sleep(3000);
		WebElement targ = driver.findElementByXPath("//h1[.='Block 2']");
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(src, targ);
		
	}

}
