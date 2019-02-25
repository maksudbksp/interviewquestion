package pac1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowToHandleAlert {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
	}
	//@AfterTest
	public void CloseBrowser() {
	driver.close();
	
	}
	
	@Test
	public void AlertHandling() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='btnConfirm']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();
		System.out.println(alt.getText());
	}
}

