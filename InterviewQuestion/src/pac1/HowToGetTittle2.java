package pac1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowToGetTittle2 {
	WebDriver driver;

	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
	}

	@Test
	public void gettittle2() {
		String ttl=driver.getTitle();
		System.out.println("The title is:" +ttl);

}
}
