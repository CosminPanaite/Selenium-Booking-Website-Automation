package internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPageElements {

	protected WebDriver driver;

	public ChatPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='comp-jr4sqg2g']/iframe")
	private WebElement frame;
	@FindBy(xpath ="//*[@id=\"minimized-chat\"]")
	private WebElement chatButton;
	@FindBy(className ="_2a8RF")
	private WebElement areaText;
	@FindBy(className ="_19e-T")
	private WebElement sendMsg;
	@FindBy(xpath ="//*[@id=\"emojis-tab-content-0\"]/button[9]")
	private WebElement emojiTab;
	@FindBy(xpath ="//button[contains(@aria-label, 'Send')]")
	private WebElement emojiSelect;
	@FindBy(id ="name")
	private WebElement nameArea;
	@FindBy(id ="email")
	private WebElement mailArea;
	@FindBy(id ="message")
	private WebElement msgArea;
	@FindBy(xpath ="//button[contains(@type, 'submit')]")
	private WebElement submitArea;
	
	
	
	
	
	
//	
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("//*[@id=\"minimized-chat\"]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.className("_2a8RF")).sendKeys("Hello!");
//	Thread.sleep(700);
//	driver.findElement(By.className("_19e-T")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//*[@id=\"emojis-tab-content-0\"]/button[1]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/button[2]"))
//			.click();
//	Thread.sleep(5000);
//	driver.findElement(By.id("name")).sendKeys("Cosmin");
//	Thread.sleep(700);
//	driver.findElement(By.id("email")).sendKeys("cosminpana2001@yahoo.com");
//	Thread.sleep(700);
//	driver.findElement(By.id("message")).sendKeys("Hello");
//	Thread.sleep(700);
//	driver.findElement(By.className("I3v_N")).click();
//	
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/button")).click();
	public void switchFrame() {
		driver.switchTo().frame(frame);
	}

	public void openChat() {
		chatButton.click();
	}
	public void fillArea() {
		areaText.sendKeys("Hi!");
	}
	public void sendMessage() {
		sendMsg.click();
	}
	public void emojiSelect() {
		emojiTab.click();
	}
	public void openEmojiTab() {
		emojiSelect.click();
	}

	public void fillName() {
		nameArea.sendKeys("Cosmin");
	}
	public void fillMail() {
		mailArea.sendKeys("cosmin@yahoo.com");
	}
	public void fillMsg() {
		msgArea.sendKeys("Hello!");
	}
	public void submitBtn() {
		submitArea.click();
}
}