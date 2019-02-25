package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewBankRaTe2 {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankrate.com/");
	}
	@Test
	public void clickmortages() throws InterruptedException {
		Actions ACT1=new Actions(driver);
		ACT1.moveToElement(driver.findElement(By.linkText("MORTGAGES"))).build().perform();
		driver.findElement(By.linkText("Mortgage calculator")).click();
	
	//@Test(priority=0)
	//public void clickMortgages() {
		//Actions ACT2=new Actions(driver);
		//ACT2.moveToElement(driver.findElement(By.linkText("Mortgage calculator"))).build().perform();
	//}
	//@Test (priority=2)
	//public void Homeprice() throws InterruptedException {
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/input")).clear();
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/input")).sendKeys("59999");
		Thread.sleep(5000);
	}
	
	
	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(60000);
		driver.close();
	}

}
