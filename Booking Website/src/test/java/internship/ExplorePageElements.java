package internship;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorePageElements {
	public WebDriver driver;


	public ExplorePageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"i6kl732v1label\"]")
	private WebElement exploreBtn;

	@FindBy(xpath = "//*[@id=\"i6ksjvsy\"]/h2")
	private WebElement text;
	
}
