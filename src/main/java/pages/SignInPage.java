package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class SignInPage extends Page {

    private static final Logger log = Logger.getLogger(String.valueOf(SignInPage.class));

    public SignInPage(PageManager pages){
        super(pages);
    }

    @FindBy(xpath = "//input[@id = 'login_field']")
    WebElement userEmailField;

    @FindBy(xpath = "//input[@id = 'password']")
    WebElement userPasswordField;

    @FindBy(xpath = "//input[@value = 'Sign in']")
    WebElement signInButton;

    @FindBy(xpath = "//div[@class = 'px-2']")
    WebElement errorMessage;

}
