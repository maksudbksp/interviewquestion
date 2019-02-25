package pageobject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PageObjModl2 {
	@Test
	public void verifyValidLogin() throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center./wordpress/wp-login.php");
		//time came to call that page
		ObjectPage1 page=new ObjectPage1(driver);
		page.typeusername();
		page.typepassword();
		page.loginpage();
		Thread.sleep(5000);
		//driver.quit();
	}

}
