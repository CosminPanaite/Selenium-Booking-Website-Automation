package internship;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class HomeTest {
	private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\z004jpeu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
}
    @Test
    public void HomePage() throws InterruptedException
    {
        driver.get("https://ancabota09.wixsite.com/intern");
        driver.manage().window().maximize();
        HomePageElements obj= new HomePageElements(driver);
        Thread.sleep(800);
        obj.SwitchFrame();
        Thread.sleep(2000);
        obj.Adults();
        Thread.sleep(800);
        obj.Kids();
        Thread.sleep(2500);
        obj.CheckIn();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        obj.SwitchFrame2();
        Thread.sleep(1000);
        obj.SelectCheckIn();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        obj.SwitchFrame2();
        obj.SelectCheckOut();
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        obj.SwitchFrame();
        Thread.sleep(1000);
        obj.Search();
        String    actual=driver.getTitle();
        String    expected="HOME | Intern";
        Assert.assertEquals(actual, expected);


    }

}
