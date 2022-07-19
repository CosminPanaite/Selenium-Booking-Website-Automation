package internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChatPageTest {

	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\z004jpeu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}


	@Test
    public void chatTest()throws InterruptedException { 
		driver.get("https://ancabota09.wixsite.com/intern/");
		driver.manage().window().maximize();
		ChatPageElements object = new ChatPageElements(driver);
	    Thread.sleep (3000); 

		object .switchFrame ();
    Thread.sleep (3000); 
    object .openChat(); 
    Thread.sleep (3000);
    object.fillArea();
    Thread.sleep (3000);
    object.sendMessage();
    Thread.sleep (3000);
    object.emojiSelect();
    Thread.sleep(3000);
    object.openEmojiTab();
    Thread.sleep (3000);
    object.fillName();
    Thread.sleep (3000);
    object.fillMail();
    Thread.sleep (3000);
    object.fillMsg();
	String txt = driver
			.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/textarea"))
			.getText();

	Assert.assertEquals(txt, "");
	
    Thread.sleep (3000);
    object.submitBtn();
 
    
    
    
    
    
    }
  
    
}
