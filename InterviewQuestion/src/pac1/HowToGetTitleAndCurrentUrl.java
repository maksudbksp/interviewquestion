package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowToGetTitleAndCurrentUrl {
	WebDriver driver;
	@BeforeTest 
		public void openbrowser() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
	}
	@AfterTest
	public void CloseBrowser( ) {
		driver.close();
	}

	@Test  //we get tittle method.
	public void TitleAndCurrentUrl(){
	String ttl= driver.getTitle();
	System.out.println("Title is :"+ttl);
	//how to get current url
	String curl=driver.getCurrentUrl();
	System.out.println("Current url is: "+curl);
	//how to get text
	String text =driver.findElement(By.xpath(".//*[@id='linkForm']/header/marquee")).getText();
	System.out.println("text is:" + text);
	
	driver.findElement(By.name("firstname")).sendKeys("maksud");
	String typedtext=driver.findElement(By.name("firstname")).getAttribute("value");
	System.out.println("typed text is:" + typedtext);
	}
}
