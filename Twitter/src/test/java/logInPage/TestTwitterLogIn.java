package logInPage;

import login.TwitterLogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import twittersearch.TwitterSearch;

import java.util.concurrent.TimeUnit;

public class TestTwitterLogIn {

    WebDriver driver;
    String baseUrl="https://www.twitter.com";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\temp\\PracticeDataProvider\\Twitter\\src\\main\\java\\utitlity\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    TwitterLogInPage twitterLogInPage;
    TwitterSearch twitterSearch;

    //create method for calling anytime
    public void accessTwitterLogIn(){
        this.twitterLogInPage=PageFactory.initElements(driver,TwitterLogInPage.class);
    }
    public void accessTwitterSearch(){
        this.twitterSearch=PageFactory.initElements(driver,TwitterSearch.class);
    }

    //makes method for twitterlogIn
    public void login(){
        accessTwitterLogIn();
        twitterLogInPage.twitterLogIn("kajol11377@yahoo.com","roushan5151");
    }
    @Test
    public void testLogIn(){
        login();
    }

    @Test
    public void testTwitterSearch(){
        login();
        accessTwitterSearch();
        twitterSearch.search("Usa");
    }
    @Test
    public void testSearchList(){
        login();
        accessTwitterSearch();
        twitterSearch.searchFromList();
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
}
