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

    @FindBy(xpath = "//summary[@aria-label = 'View profile and more']")
    WebElement viewProfileMenuButton;

    @FindBy(xpath = "//a[contains(text(), 'Signed in as')]")
    WebElement signedInNotify;

    @FindBy(xpath = "//button[contains(text(), 'Sign out')] ")
    WebElement signOutButton;

    public void clickOnTheSignInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

    public void clickOnTheSignOutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signOutButton)).click();
    }

    public void clickOnTheViewProfileMenuButton(){
        wait.until(ExpectedConditions.elementToBeClickable(viewProfileMenuButton)).click();
    }

    public WebElement getSignedInNotifyElement(){
        return signedInNotify;
    }

    public WebElement getViewProfileMenuButton(){
        return viewProfileMenuButton;
    }
}
