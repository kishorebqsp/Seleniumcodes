import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollprg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		//opening the browser
		ChromeDriver driver=new ChromeDriver();
		//to enter the url of the appication
		driver.get("https://www.ebay.com/");
		//typecasting
		JavascriptExecutor j=(JavascriptExecutor)driver;
		for(int i=1;i<=5;i++)
		{
		j.executeScript("window.scrollBy(0,500)");
		}
		
		Thread.sleep(3000);
		
		for(int i=1;i<=5;i--)
		{
			j.executeScript("window.scrollBy(0,-500)");
		}
	}

}
