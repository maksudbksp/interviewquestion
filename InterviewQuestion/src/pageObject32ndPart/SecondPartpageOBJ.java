package pageObject32ndPart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject2ForourWebsite.PageObjClassApplyForourWebsite;

public class SecondPartpageOBJ {
	@Test
	public void verifyobjectpage() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/maksu/Desktop/WebSite/OurWebSite.html");
		PageObjClassApplyForourWebsite apply=new PageObjClassApplyForourWebsite(driver);
		apply.typeusername();
		apply.typeuserlastname();
		apply.typeuseremail();
		apply.typeuseremailverify();
		apply.typeuserpassword();
		apply.typeuserdateofmonth();
		apply.typeuserdateofmonth();
		apply.typeuserdateofbirth();
		apply.typeuserdateofyear();
		apply.typeusersex();
	
	}

	}


