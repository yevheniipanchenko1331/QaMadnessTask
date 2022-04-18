package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {

    private WebDriver driver;
//    protected LoginPage loginPage;
//    protected HomePage loginPage;

    public PageManager(WebDriver driver){
        this.driver = driver;
//        loginPage = initElements(new LoginPage(this));
//        loginPage = initElements(new HomePage(this));
    }

    private <T extends Page> T initElements(T page){
        PageFactory.initElements(driver,page);
        return page;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
