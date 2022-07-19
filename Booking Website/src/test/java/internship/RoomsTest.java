package internship;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoomsTest {
	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\z004jpeu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void RoomsPage() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern");
		driver.manage().window().maximize();
		RoomsPageElements object = new RoomsPageElements(driver);
		Thread.sleep(2000);
		object.ROOMS();
		Thread.sleep(2000);
		object.Frame3();
		Thread.sleep(2000);
		object.CheckInRooms();
		Thread.sleep(2000);
		object.checkindata();
		Thread.sleep(2000);
		object.checkoutdata();
		Thread.sleep(2000);
		object.Adulti();
		Thread.sleep(2000);
		object.Copii();
		Thread.sleep(2000);
		object.Cautare();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		object.Frame4();
		Thread.sleep(2000);
		object.Clear();
		Thread.sleep(2000);
		object.Standard_Suite();
		Thread.sleep(2000);
		object.Back();
		Thread.sleep(2000);
		object.Cottage();
		Thread.sleep(2000);
		object.Back();
		Thread.sleep(2000);
		object.Classic_App();
		Thread.sleep(2000);
		driver.close();

		
	}

}