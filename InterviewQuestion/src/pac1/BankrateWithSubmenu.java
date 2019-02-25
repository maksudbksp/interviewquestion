package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankrateWithSubmenu {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankrate.com/");
	}
	@Test(priority=1)
	public void SubmenuHdl() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("MORTGAGES"))).build().perform();
		driver.findElement(By.linkText("Mortgage calculator")).click();
		Thread.sleep(4000);
		
		//Change home price;
	
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/input")).clear();
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/input")).sendKeys("250000");
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/input")).clear();
		driver.findElement(By.xpath(".//*[@id='csstyle']/main/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/input")).sendKeys("5000");
		Thread.sleep(5000);
		Select YearSelect=new Select(driver.findElement(By.xpath("//*[@id=\"text36\"]")));
		YearSelect.selectByVisibleText("15 Years");
		//driver.findElement(By.id(".//*[@id='text36']")).clear();
		//driver.findElement(By.id(".//*[@id='text36']")).sendKeys("15 Years");
		
	}

}
