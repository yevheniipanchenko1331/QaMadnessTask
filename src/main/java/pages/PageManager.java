package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {

    private WebDriver driver;
    protected SignInPage signInPage;
    protected HomePage homePage;

    public PageManager(WebDriver driver){
        this.driver = driver;
        signInPage = initElements(new SignInPage(this));
        homePage = initElements(new HomePage(this));
    }

    private <T extends Page> T initElements(T page){
        PageFactory.initElements(driver,page);
        return page;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
