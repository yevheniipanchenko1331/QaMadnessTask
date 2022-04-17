package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.logging.Logger;

public class AppManager {

    private static final Logger log = Logger.getLogger(String.valueOf(AppManager.class));

    private static WebDriver driver;

    AppManager(){
        File chromeDriver = new File("/Users/kuzenka/JavaQa/chromedriver");
        ChromeDriverService chromeDriverService = new ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriver)
                .usingAnyFreePort()
                .build();
        ChromeOptions chromeOptions = new ChromeOptions()
                .addArguments("--start-maximized");
        driver = new ChromeDriver(chromeDriverService,chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        log.info("chrome web driver started");
    }

    public static WebDriver getWebDriver(){return driver;}
}
