package internship;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FooterPageTest {
	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\z004jpeu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
    public void footerTest()throws InterruptedException { 
		driver.get("https://ancabota09.wixsite.com/intern/");
		driver.manage().window().maximize();
		FooterPageElements object = new FooterPageElements(driver);
	    Thread.sleep (2000); 
	    object.clickFb();
	    Thread.sleep (2000); 
	    object.commonSwitch();	 
	    Thread.sleep (2000); 

	    object.clickTw();
	    Thread.sleep (2000); 
	    object.commonSwitch();
	    Thread.sleep (2000); 

	    object.clickPt();
	    Thread.sleep (2000); 
	    object.commonSwitch();
	    Thread.sleep (2000); 

	    object.clickWxIcon();
	    Thread.sleep (2000); 
	    object.commonSwitch();
	    Thread.sleep (2000); 
	    
		Assert.assertEquals(object.getStringText(), "ADDRESS");

	    
	    object.clickMailIcon();
	    
	    
}
}