package pageObject2ForourWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageObjClassApplyForourWebsite {
	WebDriver driver;
	By userfname=By.xpath(".//*[@id='FN']");
	By userlastname=By.id("LN");
	By useremail=By.xpath("html/body/input[3]");
	By useremailverify=By.xpath("html/body/input[4]");
	By userpassword=By.xpath("html/body/input[5]");
	By userdateofmonth=By.xpath("html/body/select[1]");
	By userdateofbirth=By.xpath("html/body/select[2]");
	By userdateofyear=By.xpath("html/body/select[3]");
	By usersex=By.xpath("html/body/input[6]");
	
	//Using Contractor and contractor will be for this class so contractor name and class name will be same.if not same then contractor cant work. 
	public PageObjClassApplyForourWebsite (WebDriver driver) {
		this.driver=driver;
	}

	//After contractor we should apply method for page object model.
	public void typeusername() {
		driver.findElement(By.xpath(".//*[@id='FN']")).sendKeys("makshudislam");
		
	}
	public void typeuserlastname() {
		driver.findElement(By.id("LN")).sendKeys("Mohammed");
	}
	public void typeuseremail() {
		driver.findElement(By.xpath("html/body/input[3]")).sendKeys("mohammed@gmail.com");
	}
	public void typeuseremailverify() {
		driver.findElement(By.xpath("html/body/input[4]")).sendKeys("mohammed@gmail.com");
	}
	public void typeuserpassword() {
	
		driver.findElement(By.xpath("html/body/input[5]")).sendKeys("123456789");
	}
	public void typeuserdateofmonth() {
		Select dom=new Select(driver.findElement(By.xpath("html/body/select[1]")));
		dom.selectByVisibleText("Nov");
	}
	public void typeuserdateofbirth() {
		Select dob=new Select(driver.findElement(By.xpath("html/body/select[2]")));
		dob.selectByVisibleText("5");
	}
	public void typeuserdateofyear() {
		Select doy=new Select(driver.findElement(By.xpath("html/body/select[3]")));
		doy.selectByVisibleText("2011");
	}
	public void typeusersex() {
		driver.findElement(By.xpath("html/body/input[6]")).click();
	}
}


