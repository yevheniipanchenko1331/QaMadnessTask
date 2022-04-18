import helpers.UserHelper;
import managers.AppManager;
import managers.SingletonAppManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {

        AppManager app = SingletonAppManager.getInstance().manager;
        UserHelper userHelper = app.getUserHelper();
        WebDriver driver = AppManager.getWebDriver();

        @BeforeMethod
        public void beforeMethod() {
        }

        @BeforeClass
        public void beforeClass() {
        }

        @BeforeSuite
        public void beforeSuite() {
        }


        @AfterMethod
        public void afterMethod() {
        }

        @AfterClass
        public void afterClass() {
        }

        @AfterSuite
        public void afterSuite() {
                driver.quit();
        }

}
