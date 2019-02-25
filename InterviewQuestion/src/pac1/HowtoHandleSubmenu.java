package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowtoHandleSubmenu {
	WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void HandleSubmenu() throws InterruptedException {
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Social Media"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Google")).click();
	}
	@AfterTest
	public void CloseBrowser() {
		//driver.close();
	}
}
