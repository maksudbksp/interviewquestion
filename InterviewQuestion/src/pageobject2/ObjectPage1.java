package pageobject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjectPage1 {
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.id("user_pass");
	By loginButton=By.xpath(".//*[@id='wp-submit']");
	//Contractor its help to perform activity on our /http://demosite.center./wordpress/wp-login.php
	
	public ObjectPage1(WebDriver driver) {
		this.driver=driver;
	}
	public void typeusername() {
		
		driver.findElement(username).sendKeys("makshud");
	}
	public void typepassword() {
		driver.findElement(password).sendKeys("1234");
	}
	public void loginpage() {
		driver.findElement(loginButton).click();
	}

}
