package twittersearch;

import data.DataSource;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TwitterSearch {

    @FindBy(xpath = "//input[@aria-label='Search query']")
    WebElement searchBarTextBox;
    //Locator for the Clear X sign on Search Text Field
    @FindBy(xpath = "//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-n6v787 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")
    WebElement clear;

    public void clearSearchField(){
        this.clear.click();
    }
    public void search(String searchText){
        searchBarTextBox.sendKeys(searchText);
    }
    public void constantSearch(String listText){
        searchBarTextBox.sendKeys(listText);
        searchBarTextBox.sendKeys(Keys.ENTER);
        searchBarTextBox.click();
    }
    public void searchFromList(){
        List<String>searchList= DataSource.getList();
        for(int i=0; i<searchList.size(); i++){
            constantSearch(searchList.get(i));
            clearSearchField();
        }
    }
}
