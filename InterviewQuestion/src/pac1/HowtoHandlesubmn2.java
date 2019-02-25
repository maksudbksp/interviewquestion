package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowtoHandlesubmn2 {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
	}
	
	@Test
	public void Handlesubmenu2() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("News"))).build().perform();
		driver.findElement(By.linkText("VOA")).click();
	}
	
	@AfterTest
	public void closebrowser() {
		driver.close();
	}
	
}

