package helpers;

import managers.AppManager;
import org.openqa.selenium.WebElement;
import pages.PageManager;

import java.util.List;

public class UserHelper extends PageManager {

    public UserHelper() {
        super(AppManager.getWebDriver());
    }

    public void userSignIn(String userNameOrEmail,String userPassword){
        homePage.clickOnTheSignInButton();
        signInPage.fillUserNameOrEmailField(userNameOrEmail);
        signInPage.fillUserPasswordField(userPassword);
        signInPage.clickOnSignInButton();
    }


    public WebElement getViewUserMenuElem(){
        return homePage.getViewProfileMenuButton();
    }

    public String getHeadFromUserMenu(){
        homePage.clickOnTheViewProfileMenuButton();
        return homePage.getSignedInNotifyElement().getText();
    }

    public String getSignInErrorMessageText(){
        return signInPage.getErrorMessage();
    }

    public void userSignOut(){
        getDriver().navigate().refresh();
        homePage.clickOnTheViewProfileMenuButton();
        homePage.clickOnTheSignOutButton();
    }

}
