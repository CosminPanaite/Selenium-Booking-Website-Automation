package internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class ContactTest {
	private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\z004jpeu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
}
    @Test
	public void ContactPage() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern/contact");
		driver.manage().window().maximize();
		ContactPageElements object = new ContactPageElements(driver);
		Thread.sleep(2000);
		object.autoCompleteName();
		Thread.sleep(2000);
		object.autoCompleteMail();
		Thread.sleep(2000);
		object.autoCompletePhone();
		Thread.sleep(2000);
		object.autoCompleteMsg();
		Thread.sleep(2000);
		object.assertTest();
		
    }
    }
