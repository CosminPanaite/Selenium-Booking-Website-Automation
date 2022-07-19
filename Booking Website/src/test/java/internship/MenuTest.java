package internship;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MenuTest {

	private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\z004jpeu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
}
    @Test
	public void MenuButtons() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern");
		driver.manage().window().maximize();
		MenuPageButtons object = new MenuPageButtons(driver);
		Thread.sleep(2000);
		object.exploreClick();
		Thread.sleep(2000);
		object.RoomsClick();
		Thread.sleep(2000);
		object.contactClick();
    }
}
