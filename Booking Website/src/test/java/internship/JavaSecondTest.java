package internship;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class JavaSecondTest {
	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\z004jpeu\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

//	    @Test
//	    public void verifySearchButton() {
//
//	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//	        driver.get("http://www.google.com");
//
//	        String search_text = "Google Suche";
//	        WebElement search_button = driver.findElement(By.name("btnK"));
//
//	        String text = search_button.getAttribute("value");
//
//	        Assert.assertEquals(text, search_text, "Text not found!");
//	    }
	@Test(description = "Start the chrome driver and acces the first page", priority = 1)
	public void openPage() {
		driver.get("https://ancabota09.wixsite.com/intern");
		driver.manage().window().maximize();
		String expectTitle = driver.getTitle();
		String actualTitle = "HOME | Intern";
		Assert.assertEquals(expectTitle, actualTitle);
	}

	@Test(priority = 2)
	public void exploreMenu() {
		driver.get("https://ancabota09.wixsite.com/intern");
		driver.manage().window().maximize();
		WebElement exploreBtn = driver.findElement(By.id("i6kl732v1label"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		exploreBtn.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String message = driver.getTitle();

		Assert.assertEquals(message, "EXPLORE | Intern");
		WebElement roomsBtn = driver.findElement(By.id("i6kl732v2"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		roomsBtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		// WebElement textt=driver.findElement(By.partialLinkText("STAY IN THE CITY"));
		// Assert.assertEquals(textt.getText(), "STAY IN THE CITY");
		WebElement contactBtn = driver.findElement(By.id("i6kl732v3label"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		contactBtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement text = driver.findElement(By.xpath("//*[@id=\"i6lxanil\"]/h3/font"));

		Assert.assertEquals(text.getText(),
				"If you have any questions, please contact us by telephone or email and we'll get back to you as soon as possible.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void contactPage()

	{
		driver.get("https://ancabota09.wixsite.com/intern/contact");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,800)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement nameField = driver.findElement(By.id("input_comp-jxbsa1e9"));
		nameField.sendKeys("Cosmin");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement mailField = driver.findElement(By.id("input_comp-jxbsa1em"));
		mailField.sendKeys("Cosmin@yahoo.com");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement nrField = driver.findElement(By.id("input_comp-jxbsa1ev"));
		nrField.sendKeys("0744556677");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement txtField = driver.findElement(By.id("textarea_comp-jxbsa1f7"));
		txtField.sendKeys("Hello!");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement text1 = driver.findElement(By.xpath(
				"/html/body/div/div/div[4]/div/main/div/div/div/div[2]/div/div/div/section[2]/div[2]/div/div[2]/div/div/h3/font"));
		Assert.assertEquals(text1.getText(), "TALK TO US");
	}

	@Test(priority = 4)
	public void setDate() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern");
		driver.manage().window().maximize();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("window.scroll(0,400)");

		driver.switchTo().frame(0);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement checkInBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[2]/button"));
		checkInBtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().parentFrame();

		driver.switchTo().frame(2);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().parentFrame();

		driver.switchTo().frame(2);
		WebElement checkIn = driver.findElement(By.xpath("//button[contains(@aria-label, '30')]"));

		checkIn.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		WebElement checkOut = driver.findElement(By.xpath("//button[contains(@aria-label, '5')]"));

		Thread.sleep(2000);

		checkOut.click();

		driver.switchTo().frame(0);

		

		Thread.sleep(2000);
		String expectTitle = driver.getTitle();
		String actualTitle = "HOME | Intern";
		Assert.assertEquals(expectTitle, actualTitle);
		Thread.sleep(2000);

		Integer i = 1;

		WebElement adultUp = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[4]/div/a[1]"));
		while (i < 5) {
			adultUp.click();
			i++;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement adultDown = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[4]/div/a[2]"));
		adultDown.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/div/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/div/a[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
		
	}

	@Test(priority = 5)
	public void footer() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern");

		Thread.sleep(2000);

		WebElement fbIcon = driver.findElement(By.xpath("//*[@id='img_0_i6rlbitx']/img"));
		Thread.sleep(4000);
		fbIcon.click();
		Thread.sleep(4000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(1));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window(newTb.get(0));

		Thread.sleep(4000);

		driver.get("https://ancabota09.wixsite.com/intern");

		WebElement twIcon = driver.findElement(By.xpath(
				"/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[2]/div[2]/div/div[2]/div/div/ul/li[2]/a/wix-image/img"));
		twIcon.click();
		ArrayList<String> newTb1 = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb1.get(1));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window(newTb1.get(0));
		driver.get("https://ancabota09.wixsite.com/intern");

		Thread.sleep(4000);

		WebElement ptIcon = driver.findElement(By.xpath(
				"/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[2]/div[2]/div/div[2]/div/div/ul/li[3]/a/wix-image/img"));
		ptIcon.click();
		ArrayList<String> newTb2 = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb2.get(1));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window(newTb2.get(0));
		Thread.sleep(4000);

		WebElement wxIcon = driver.findElement(By.xpath(
				"/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[1]/div[2]/div/div[2]/div/div[9]/p[2]/span/a"));
		wxIcon.click();
		String txt1 = driver.findElement(By.xpath(
				"/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[1]/div[2]/div/div[2]/div/div[1]/p/span"))
				.getText();
		Assert.assertEquals(txt1, "ADDRESS");

		WebElement mailIcon = driver.findElement(By.xpath(
				"/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[1]/div[2]/div/div[2]/div/div[6]/p[1]/a"));
		mailIcon.click();

	}

	@Test(priority = 6)
	public void chatButton() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"comp-jr4sqg2g\"]/iframe")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"minimized-chat\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("_2a8RF")).sendKeys("Hello!");
		Thread.sleep(700);
		driver.findElement(By.className("_19e-T")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"emojis-tab-content-0\"]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/button[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys("Cosmin");
		Thread.sleep(700);
		driver.findElement(By.id("email")).sendKeys("cosminpana2001@yahoo.com");
		Thread.sleep(700);
		driver.findElement(By.id("message")).sendKeys("Hello");
		Thread.sleep(700);
		driver.findElement(By.className("I3v_N")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/button")).click();
//		String txt1 = driver
//				.findElement(By.xpath("//*[@id=\"chat-messages-list\"]/div[20]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]"))
//				.getText();
//
//		Assert.assertEquals(txt1, "Thanks! Message us here.");
		Thread.sleep(4000);
		String txt = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/textarea"))
				.getText();

		Assert.assertEquals(txt, "");
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"i71ww6nk\"]/p[1]/a")).click();
		

	}

	@Test(priority = 7)
	public void roomsPage() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern/rooms");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.className("_49_rs")));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"check-in\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"body\"]/table/tbody/tr[5]/td[5]/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"hotel-container\"]/section/div/div/form/ul/li[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[4]/button"))
				.click();
		Thread.sleep(3000);

		Integer i = 1;

		WebElement adultUp = driver.findElement(By.xpath("//*[@id='adults']/a[1]"));
		while (i < 5) {
			adultUp.click();
			i++;
		}
		Thread.sleep(2000);

		WebElement adultDown = driver.findElement(By.xpath("//*[@id=\"adults\"]/a[2]"));
		adultDown.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"children\"]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"children\"]/a[2]")).click();
     	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[contains(@wix-bi,'SEARCH')]")).click();
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h2/a")).click();

    	String expectTitle = driver.getTitle();
		String actualTitle = "ROOMS | Intern";
		Assert.assertEquals(expectTitle, actualTitle);
		
	}
	@Test(priority = 8)
	public void standardSuite() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern/rooms");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.className("_49_rs")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div/div[2]/div/ul/li[1]/div/div[1]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/form/ul/li[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[2]/div[2]/div/form/ul/li[1]/div[2]/div/div[2]/table/tbody/tr[5]/td[5]/button")).click();
		Thread.sleep(3000);
		String expectTitle = driver.getTitle();
		String actualTitle = "ROOMS | Intern";
		Assert.assertEquals(expectTitle, actualTitle);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[2]/div[2]/div/form/ul/li[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[5]/button")).click();
		Integer i=1;
		WebElement adultUp = driver.findElement(By.xpath("//*[@id=\"adults\"]/a[1]"));
		while (i < 4) {
			adultUp.click();
			i++;
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[3]/div[2]/div[4]/ul/li[2]/span/a")).click();
		Thread.sleep(3000);
		ArrayList<String> newTb2 = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb2.get(1));
		Thread.sleep(4000);
		driver.close();
		
	}
	@Test(priority = 9)
	public void cottageRoom() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern/rooms");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.className("_49_rs")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/ul/li[2]/div/div[2]/div[4]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/form/ul/li[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[2]/div[2]/div/form/ul/li[1]/div[2]/div/div[2]/table/tbody/tr[5]/td[5]/button")).click();
		Thread.sleep(3000);
		String expectTitle = driver.getTitle();
		String actualTitle = "ROOMS | Intern";
		Assert.assertEquals(expectTitle, actualTitle);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[2]/div[2]/div/form/ul/li[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[5]/button")).click();
		Integer i=1;
		WebElement adultUp = driver.findElement(By.xpath("//*[@id=\"adults\"]/a[1]"));
		while (i < 3) {
			adultUp.click();
			i++;
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[3]/div[2]/div[5]/ul/li[2]/span/a")).click();

		Thread.sleep(3000);
		ArrayList<String> newTb2 = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb2.get(1));
		Thread.sleep(4000);
		driver.close();
		
	}
	@Test(priority = 9)
	public void classicApp() throws InterruptedException {
		driver.get("https://ancabota09.wixsite.com/intern/rooms");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.className("_49_rs")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/ul/li[3]/div/div[2]/div[4]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div/form/ul/li[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[2]/div[2]/div/form/ul/li[1]/div[2]/div/div[2]/table/tbody/tr[5]/td[5]/button")).click();
		Thread.sleep(3000);
		String expectTitle = driver.getTitle();
		String actualTitle = "ROOMS | Intern";
		Assert.assertEquals(expectTitle, actualTitle);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[2]/div[2]/div/form/ul/li[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[5]/button")).click();
		Integer i=1;
		WebElement adultUp = driver.findElement(By.xpath("//*[@id=\"adults\"]/a[1]"));
		while (i < 3) {
			adultUp.click();
			i++;
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"singleroom\"]/div[3]/div[2]/div[5]/ul/li[2]/span/a")).click();

		Thread.sleep(3000);
		ArrayList<String> newTb2 = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb2.get(1));
		Thread.sleep(4000);
		driver.close();
		
	}
}
////	    	WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"comp-jxbsa1fi\"]/button"));
////	    	submitBtn.click();
////	    	
////	    	try {
////				Thread.sleep(4500);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
////	    	
////	    	WebElement xBtn=driver.findElement(By.xpath("//*[@id=\"CAPTCHA_DIALOG_ROOT_COMP\"]/div[2]/div/button/svg"));
////	    	xBtn.click();
//	    	
//	    	js.executeScript("window.scroll(0,-800)");
//	    	
//	    	WebElement bookNowBtn=driver.findElement(By.className("_1Qjd7"));	
//	    	try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//	    	bookNowBtn.click();
//	    	WebElement homeAwayBtn=driver.findElement(By.partialLinkText("HOME & AWAY"));
//	    	try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//	    	homeAwayBtn.click();
//	    	
//	    	try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//	    	js.executeScript("window.scroll(0,400)");
//	    	//*[@id="check-in"]
//	    	
//	    	
//	    	WebElement chekinbtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[2]/button"));
//	    	try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//	    	chekinbtn.click();
//	    	try {
//				Thread.sleep(4000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//	    	
//
//	    	
//	    }
////	    @Test(description="scroll the page down",priority=2)
////	    public void scrollPageDown() {
////	    	driver.get("https://ancabota09.wixsite.com/intern");
////	    	driver.manage().window().maximize();
////	    	
////	    }
//}
