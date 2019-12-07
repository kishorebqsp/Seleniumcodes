import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver", "./software/chromedriver.exe");
		// opening the browser
		ChromeDriver driver = new ChromeDriver();
		// to enter the url of the appication
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//div[.='Log In/Sign Up'])[2]").click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement ele = driver.findElementByXPath("//h3[.='Scan with Paytm app to Login']");
		driver.switchTo().frame(ele);
		//ele.click();
		driver.findElementById("input_0").sendKeys("ahghafhghvGH");

	}

}
