package internship;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenuPageButtons {

	protected WebDriver driver;

	public MenuPageButtons(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a/div/div/p[contains(text(),'HOME')]")
	private WebElement homeButtonText;
	
	@FindBy(xpath = "//a/div/div/p[contains(text(),'EXPLORE')]")
	private WebElement exploreButtonText;
	
	@FindBy(xpath = "//a/div/div/p[contains(text(),'ROOMS')]")
	private WebElement roomsButtonText;
	
	@FindBy(xpath = "//a/div/div/p[contains(text(),'CONTACT')]")
	private WebElement contactButtonText;
	
	@FindBy(xpath = "//span[contains(text(),'BOOK ')]")
	private WebElement bookNowButtonText;
	
	
	
	@FindBy(xpath = "(//p[@class='ccDUc'])[1]") // //p[@id='i6kl732v0label']
	private WebElement homeButton;
	
	@FindBy(xpath = "(//p[@class='ccDUc'])[2]")
	private WebElement exploreButton;
	
	@FindBy(xpath = "(//p[@class='ccDUc'])[3]")
	private WebElement roomsButton;
	
	@FindBy(xpath = "(//p[@class='ccDUc'])[4]")
	private WebElement contactButton;
	
	@FindBy(xpath = "//span[@class='nr31w']")
	private WebElement bookNowButton;
	@FindBy(xpath = "//*[@id=\"i6lxanil\"]/h3/font")
	private WebElement text;

	
	
	 public void exploreClick()
	    {
	        exploreButtonText.click();
	    }
	 public void RoomsClick()
	    {
	        roomsButtonText.click();
	    }
	 public void contactClick()
	    {
	        contactButtonText.click();
	    }
	 
	 public void bookNowClick()
	    {
	        bookNowButton.click();
	    }
	 public void assertTest() {
		 Assert.assertEquals(text.getText(),
					"If you have any questions, please contact us by telephone or email and we'll get back to you as soon as possible.");
	 }
	
}
