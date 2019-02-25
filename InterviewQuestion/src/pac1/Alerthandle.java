package pac1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerthandle {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
		
	}
	@Test
	public void Alerthandles() {
		driver.findElement(By.xpath(".//*[@id='btnAlert']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
	}

}
