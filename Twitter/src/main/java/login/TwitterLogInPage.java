package login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwitterLogInPage {

    @FindBy(linkText = "Log in")
    WebElement firstLoginBtn;
    @FindBy(xpath = "//input[@placeholder='Phone, email or username']")
    WebElement emailText;
    @FindBy(xpath = "//input[@class='js-password-field']")
    WebElement passwordText;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement secondLogInBtn;

    public void twitterLogIn(String userName,String password){
        firstLoginBtn.click();
        emailText.sendKeys(userName);
        passwordText.sendKeys(password);
        secondLogInBtn.click();
    }
}
