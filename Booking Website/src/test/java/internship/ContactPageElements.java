package internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactPageElements {
	protected WebDriver driver;
	
	public ContactPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"input_comp-jxbsa1e9\"]")
	private WebElement nameField;
	
	@FindBy(xpath = "//*[@id=\"input_comp-jxbsa1em\"]")
	private WebElement emailField;
	
	@FindBy(xpath = "//*[@id=\"input_comp-jxbsa1ev\"]")
	private WebElement phoneField;
	
	@FindBy(xpath = "//*[@id=\"textarea_comp-jxbsa1f7\"]")
	private WebElement messageField;
	
	@FindBy(xpath = "//*[@id=\"comp-jxbsa1fi\"]/button")
	private WebElement submitButtonField;
	
	
	@FindBy(xpath = "/html/body/div/div/div[4]/div/main/div/div/div/div[2]/div/div/div/section[2]/div[2]/div/div[2]/div/div/h3/font")
	private WebElement text1;
	public void autoCompleteName() {
		nameField.sendKeys("Cosmin");
	
	}
	public void autoCompleteMail() {
		
		emailField.sendKeys("cosmin21@yahoo.com");
	}
	public void autoCompletePhone() {
		phoneField.sendKeys("0724556677");
	
	}
	public void autoCompleteMsg() {
	messageField.sendKeys("Hello!");		
	}
	
	public void assertTest() {
		Assert.assertEquals(text1.getText(), "TALK TO US");
		
		}
		


}
