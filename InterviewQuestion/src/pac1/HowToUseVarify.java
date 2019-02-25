package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HowToUseVarify {
	
	WebDriver driver;
	@Test
	public void TextVirify() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Text=driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/div[1]/div[2]/span[1]"));
		String Actualtext=Text.getText();
		System.out.println("Actual text is :" +Actualtext);
		String Expectedtext="See photos and updates";
		Assert.assertEquals(Actualtext, Expectedtext);
		SoftAssert SOA=new SoftAssert();
		SOA.assertEquals(Actualtext, Expectedtext);
		driver.close();
		SOA.assertAll();
		/*if(Actualtext==Expectedtext) {
			System.out.println("TEXT IS TRUE" + Actualtext);
		}
		else {
			System.out.println("TEXT IS NOT CORRECT");
		}*/
	}
	
	

}
