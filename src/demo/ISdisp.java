package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISdisp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
          boolean d = ele.isSelected();
          System.out.println(d);
          if(ele.isSelected())
          {
        	  ele.sendKeys("admin");
        	  System.out.println("pass:element is dispalyed");
          }
          else
          {
        	  System.out.println("fail:element is not dispalyed");
          }
	}

}
