import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam {

	public static void main(String[] args) {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//WebElement ele = driver.findElementById("gh-ac");
		Pom p=new Pom(driver);
	     driver.navigate().refresh();
	     p.serachtxtbox("phone");
		//ele.sendKeys("phone");
		
		

	}

}
