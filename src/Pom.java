import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	//declare
	@FindBy(id="gh-ac")
	private WebElement serachtb;
	
	//initalization
	Pom(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void serachtxtbox(String prduct)
	{
		serachtb.sendKeys(prduct);
	}
	

}
