import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://reservas.verticepatagonia.cl/index.xhtml");
		WebElement ele = driver.findElementByXPath("(//Select[contains(@id,'form1')])[2]");
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElementByXPath("//div[.='Continuar']").click();
		
	}

}
