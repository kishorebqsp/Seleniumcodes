import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		//opening the browser
		ChromeDriver driver=new ChromeDriver();
		//to enter the url of the appication
		driver.get("https://luxire.com/");
		WebElement ele = driver.findElementByXPath("//a[.='Account']");
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[.='Login']").click();
		WebElement ele1 = driver.findElementById("CustomerEmail");
		a.contextClick(ele1).perform();
		Thread.sleep(3000);
		WebElement doubleclcik = driver.findElementByXPath("//input[@value='Login']");
		a.doubleClick(doubleclcik).perform();
	}

}
