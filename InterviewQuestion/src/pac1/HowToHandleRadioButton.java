package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowToHandleRadioButton {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test
	public void radiobutton() {
		
	}
	

}
