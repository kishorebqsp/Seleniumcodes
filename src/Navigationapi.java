import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationapi {

	public static void main(String[] args) {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		//opening the browser
		ChromeDriver driver=new ChromeDriver();
		//enter the url of the application
		driver.get("https://www.facebook.com/");
		driver.findElementByLinkText("Forgotten account?").click();
		driver.findElementById("identify_email").sendKeys("67477777");
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElementByName("firstname").sendKeys("hagjhgGjkfkg");
		driver.navigate().refresh();
		
	}

}
