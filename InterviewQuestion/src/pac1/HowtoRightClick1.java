package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowtoRightClick1 {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
	}
	@Test
	public void HowtohandleRightClick() {
		WebElement SM=driver.findElement(By.partialLinkText("Countries"));
		Actions act1=new Actions(driver);
		act1.contextClick(SM).build().perform();
		System.out.println("Right click is true "+act1);
	}
	

}
