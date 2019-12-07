package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindAll({
		@FindBy(id="user2355"),
		//(name="username"),
		@FindBy(xpath="//input[@placeholder='Username233']")
	})

			private WebElement usernametb;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public void usertb(String us)
	{
		usernametb.sendKeys(us);
	}
	

}
