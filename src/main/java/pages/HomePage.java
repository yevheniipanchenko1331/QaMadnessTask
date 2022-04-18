package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class HomePage extends Page {

    private static final Logger log = Logger.getLogger(String.valueOf(HomePage.class));

    public HomePage(PageManager pages){
        super(pages);
    }

    @FindBy(xpath = "//a[@href='/login']")
    WebElement signInButton;

    public void clickOnTheLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }
}
