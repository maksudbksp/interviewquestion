package Pak2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToVerifyImage {
	
	WebDriver driver;
	@Test
	public void ImageVerify() {
	System.setProperty("webdriver.chrome.driver", "D:\\ITTraning\\AllDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/ITTraning/WebSite/Bangladesh.html");
	boolean Image=driver.findElement(By.xpath("/html/body/img")).isDisplayed();
	
	if(Image==true) {
		System.out.println("Image is displayed");
	}
	else {
		System.out.println("Image is not displayed");
	}
	}
}
