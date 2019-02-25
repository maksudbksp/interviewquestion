package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowToDoubleClick {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() throws InterruptedException {
		//System.setPropertie(webd);
		Thread.sleep(4000);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void doubleClick() {
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
		WebElement DL=driver.findElement(By.xpath(".//*[@id='fullbody']/button[1]"));
		Actions act=new Actions(driver);
		act.doubleClick().build().perform();
	}
	
	

}
