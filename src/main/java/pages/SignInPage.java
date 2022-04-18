package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class SignInPage extends Page {

    private static final Logger log = Logger.getLogger(String.valueOf(SignInPage.class));

    public SignInPage(PageManager pages){
        super(pages);
    }

    @FindBy(xpath = "//input[@id = 'login_field']")
    WebElement userNameOrEmailField;

    @FindBy(xpath = "//input[@id = 'password']")
    WebElement userPasswordField;

    @FindBy(xpath = "//input[@value = 'Sign in']")
    WebElement signInButton;

    @FindBy(xpath = "//div[@class = 'px-2']")
    WebElement errorMessage;

    public void fillUserNameOrEmailField(String userNameOrEmail){
        wait.until(ExpectedConditions.visibilityOf(userNameOrEmailField)).sendKeys(userNameOrEmail);
    }

    public void fillUserPasswordField(String userPassword){
        wait.until(ExpectedConditions.visibilityOf(userPasswordField)).sendKeys(userPassword);
    }

    public void clickOnSignInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

    public String getErrorMessage(){
        return wait.until(ExpectedConditions.visibilityOf(errorMessage)).getText();
    }
}
