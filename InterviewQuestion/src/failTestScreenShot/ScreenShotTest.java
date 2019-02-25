package failTestScreenShot;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomizeListener.class)
public class ScreenShotTest extends Base {
	
	@BeforeTest(alwaysRun=true)
	public void setup() {
		initialize();
	}
	@Test(groups="A", invocationCount=3, timeOut=20, priority=1)
	public void facebook() {
		driver.get("https://www.facebook.com");
		Assert.assertEquals(true, false);
		
	}
	//@Test(groups="B")
	public void SuperTech() {
		driver.get("file:///D:/ITTraning/WebSite/SuperTech.html");
		Assert.assertEquals(true, true);
		
	}
	//@Test(groups="A")
	public void google() {
		driver.get("https://www.google.com");
		Assert.assertEquals(true, false);
		
	}
	//@Test(groups="B")
	public void selenium() {
		driver.get("https://www.seleniumhq.org");
		Assert.assertEquals(true, true);
		
	}
	@AfterTest(alwaysRun=true)
	public void teardown() {
		driver.close();
	}
}
