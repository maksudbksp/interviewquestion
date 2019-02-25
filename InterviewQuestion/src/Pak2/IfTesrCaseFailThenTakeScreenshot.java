package Pak2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IfTesrCaseFailThenTakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraning\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		try {
			driver.findElement(By.id("u_0_c")).sendKeys("Mohammed");
			driver.findElement(By.name("lastname")).sendKeys("Islam");
			driver.findElement(By.name("reg_email__")).sendKeys("bksp@gmail");
			
			JavascriptExecutor jse=((JavascriptExecutor)driver);
			
			WebElement PW=driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
			jse.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid red;');", PW);
			
			

			Select monthSelect=new Select(driver.findElement(By.id("month")));
			monthSelect.selectByIndex(3);

			Select daySelect=new Select(driver.findElement(By.name("birthday_day")));
			daySelect.selectByValue("5");

			Select yearSelect=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
			yearSelect.selectByVisibleText("1986");
			Thread.sleep(3000);
			
			WebElement MRB=driver.findElement(By.xpath(".//*[@id='year']"));
			jse.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid red;');", MRB);
			

			driver.findElement(By.xpath(".//*[@id='u_0_nn']")).click();
			
			

			System.out.println("Facebook signUp Successfully");
			
		}catch(Exception e) {
			
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("D:\\ITTraning\\Facebook.jpg"));
		}
		driver.close();

	}

}
