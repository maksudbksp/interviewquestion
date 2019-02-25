package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowToGetText2 {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
		driver.manage().window().maximize();
				
	}
	@Test
	public void gettext() {
		String gtx=driver.findElement(By.xpath(".//*[@id='linkForm']/header/marquee/font")).getText();
		System.out.println("The text is:" +gtx);
	}
	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
