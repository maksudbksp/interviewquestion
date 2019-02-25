package pac1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowCanScrollUpandDown {
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(800,700));
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
		
	}
	@Test
	public void ScrollUpandDown() throws InterruptedException {
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		//For scroll down cast driver into java script executor
		jsc.executeScript("window.scrollBy(0,-2300)");
		Thread.sleep(4000);
		//For scroll down
		jsc.executeScript("window.scrollBy(0,2300)");
		Thread.sleep(4000);
		//For scroll Right
		jsc.executeScript("window.scrollBy(5000)");
		Thread.sleep(4000);
		//For scroll left
		jsc.executeScript("window.scrollBy(-5000)");
		Thread.sleep(4000);
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
	}

}
