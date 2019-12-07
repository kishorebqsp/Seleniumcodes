import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement logo = driver.findElement(By.xpath("(//img)[2]"));
		String tag = logo.getTagName();
		System.out.println(tag);
		if(tag.equals("img"))
		{
			System.out.println("it is a image");
		}
		else
		{
			System.out.println("it is not image");
		}

	}

}
