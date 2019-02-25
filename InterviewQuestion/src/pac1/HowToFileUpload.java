package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowToFileUpload {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() throws Exception {
		driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/maksu/Desktop/WebSite/FileUpload.html");
		Thread.sleep(4000);
	}

	
	
	
	@Test
	public void FileUpload() throws Exception {
		driver.findElement(By.xpath("/html/body/input")).sendKeys("C:\\Users\\maksu\\Desktop\\WebSite\\Car.jpg");
		
		Thread.sleep(4000);
		
	}

}
