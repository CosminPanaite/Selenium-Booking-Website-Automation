package internship;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class HomePageElements {

	 WebDriver driver;
	    public HomePageElements(WebDriver driver)
	    {

	        this.driver=driver;
	         PageFactory.initElements(driver, this);
	    }

	    @FindBy(how=How.CLASS_NAME, using ="_49_rs")
	    private WebElement Frame;

	    @FindBy(how=How.CLASS_NAME, using ="up")
	    private WebElement adulti;
	    @FindBy(how=How.XPATH, using ="//*[@id=\"children\"]/a[1]")
	    private WebElement copii;

	    @FindBy(how=How.ID, using ="check-in")
	    private WebElement CheckIn;

	    @FindBy(how=How.CLASS_NAME, using ="_2DJg7")
	    private WebElement Frame2;

	    @FindBy(how=How.XPATH, using ="/html/body/div/main/div/div[2]/table/tbody/tr[3]/td[5]/button/span")
	    private WebElement datacheckin;

	    @FindBy(how=How.XPATH, using ="/html/body/div/main/div/div[2]/table/tbody/tr[6]/td[1]/button/span")
	    private WebElement datacheckout;

	    @FindBy(how=How.XPATH, using ="//*[@id=\"search-widget\"]/form/ul/li[6]/button")
	    private WebElement Search;



	    public void SwitchFrame()
	    {
	        driver.switchTo().frame(Frame);
	    }
	    public void Adults() 
	    {
	        adulti.click();

	    }

	    public void Kids()
	    {
	        copii.click();
	    }

	    public void CheckIn()
	    {
	        CheckIn.click();
	    }

	    public void SwitchFrame2()
	    {

	        driver.switchTo().frame(Frame2);
	    }

	    public void SelectCheckIn()
	    {
	        datacheckin.click();
	    }

	    public void SelectCheckOut()
	    {
	        datacheckout.click();
	    }

	    public void Search()
	    {
	        Search.click();
	    }
}
