package internship;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPageElements {

	protected WebDriver driver;

	public FooterPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@id='img_0_i6rlbitx']/img")
	WebElement fbIcon;  
	@FindBy(xpath ="/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[2]/div[2]/div/div[2]/div/div/ul/li[2]/a/wix-image/img")
	WebElement twIcon;  
	@FindBy(xpath ="/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[2]/div[2]/div/div[2]/div/div/ul/li[3]/a/wix-image/img")
	WebElement ptIcon;  
	@FindBy(xpath ="/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[1]/div[2]/div/div[2]/div/div[9]/p[2]/span/a")
	WebElement wxIcon;  
	@FindBy(xpath ="/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[1]/div[2]/div/div[2]/div/div[6]/p[1]/a")
	WebElement mailIcon;  

	public void clickFb() {
		fbIcon.click();
	}

	public void clickTw() {
		twIcon.click();
	}

	public void clickPt() {
		ptIcon.click();
	}
	public void clickMailIcon() {
		mailIcon.click();
	}
	public void clickWxIcon() {
		wxIcon.click();
	}
	
	 public void commonSwitch() throws InterruptedException {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(1));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window(newTb.get(0));

		Thread.sleep(4000);

		driver.get("https://ancabota09.wixsite.com/intern");
	}
	public String getStringText() {
		return  driver.findElement(By.xpath(
				"/html/body/div/div/div[4]/div/footer/div[2]/div[2]/div[2]/div/div/section[1]/div[2]/div/div[2]/div/div[1]/p/span"))
				.getText();
	}
	 
}
