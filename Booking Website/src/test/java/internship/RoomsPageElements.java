package internship;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RoomsPageElements {
    WebDriver driver;
    public RoomsPageElements(WebDriver driver)
    {

        this.driver=driver;
         PageFactory.initElements(driver, this);
    }

    @FindBy(how=How.ID, using ="i6kl732v2label")
    private WebElement ROOMS;

    @FindBy(how=How.XPATH, using ="//*[@id=\"i6klgqap_0\"]/iframe")
    private WebElement Frame3;

    @FindBy(how=How.XPATH, using ="//*[@id=\"check-in\"]")
    private WebElement checkinrooms;

    @FindBy(how=How.XPATH, using ="//*[@id=\"hotel-container\"]/section/div/div/form/ul/li[1]/div[2]/div/div[2]/table/tbody/tr[3]/td[5]/button/span")
    private WebElement datecheckinrooms;

    @FindBy(how=How.XPATH, using ="//*[@id=\"hotel-container\"]/section/div/div/form/ul/li[2]/div[2]/div/div[2]/table/tbody/tr[6]/td[1]/button/span")
    private WebElement datecheckoutrooms;

    @FindBy(how=How.XPATH, using ="//*[@id=\"adults\"]/a[1]")
    private WebElement adultirooms;

    @FindBy(how=How.XPATH, using ="//*[@id=\"children\"]/a[1]")
    private WebElement copiirooms;

    @FindBy(how=How.XPATH, using ="//*[@id=\"hotel-container\"]/section/div/div/form/ul/li[5]/button")
    private WebElement searchrooms;

    @FindBy(how=How.XPATH, using ="//*[@id=\"i6klgqap_0\"]/iframe")
    private WebElement Frame4;

    @FindBy(how=How.XPATH, using ="//*[@id=\"content\"]/div/div[1]/h2/a/span")
    private WebElement Clear;

    @FindBy(how=How.XPATH, using ="//*[@id=\"content\"]/div/div[2]/div/ul/li[1]/div/div[2]/div[4]/button")
    private WebElement Standard_Suite;

    @FindBy(how=How.XPATH, using ="//*[@id=\"content\"]/div/div[2]/div/ul/li[2]/div/div[2]/div[4]/button")
    private WebElement Cottage;

    @FindBy(how=How.XPATH, using ="//*[@id=\"content\"]/div/div[2]/div/ul/li[3]/div/div[2]/div[4]/button")
    private WebElement Classic_App;

    @FindBy(how=How.XPATH, using ="//*[@id=\"singleroom\"]/div[3]/header/button")
    private WebElement Back;





    public void ROOMS()
    {
        ROOMS.click();
    }
    public void Frame3()
    {
        driver.switchTo().frame(Frame3);
    }

    public void CheckInRooms()
    {
        checkinrooms.click();
    }

    public void checkindata()
    {
        datecheckinrooms.click();
    }

    public void checkoutdata()
    {
        datecheckoutrooms.click();
    }

    public void Adulti()
    {
        adultirooms.click();
    }

    public void Copii()
    {
        copiirooms.click();
    }

    public void Cautare()
    {
        searchrooms.click();
    }

    public void Frame4()
    {
        driver.switchTo().frame(Frame4);
    }

    public void Clear()
    {
        Clear.click();
    }

    public void Standard_Suite()
    {
        Standard_Suite.click();
    }
    public void Cottage()
    {
        Cottage.click();
    }
    public void Classic_App()
    {
        Classic_App.click();
    }
    public void Back()
    {
        Back.click();
    }
}