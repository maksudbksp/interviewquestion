package pac1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandling {
	
	WebDriver driver;
	@BeforeTest
	public void openbrowser () {
		driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
	}
	@Test
	public void Windowhandle() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Social Media"))).build().perform();
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(3000);
		//what is that call inside the submenu page
		String mainWindow=driver.getWindowHandle();
		
		Set<String>ChildWindow=driver.getWindowHandles();
		//what is called for condition
		
		for(String child:ChildWindow) {
			driver.switchTo().window(child);
		}
		
		driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
		
		driver.close(); //child window closed
		
		driver.switchTo().window(mainWindow); //return to main window
		
		driver.findElement(By.xpath(".//*[@id='form2']/input[1]")).sendKeys("Maksud");
		
	}
	//@AfterTest
	public void closebrowser() throws Exception {
		Thread.sleep(4000);
		//driver.close();
		driver.quit();
	}


}
