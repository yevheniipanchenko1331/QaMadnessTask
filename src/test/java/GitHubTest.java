import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import util.PropertyLoader;

import java.util.logging.Logger;

public class GitHubTest extends TestBase {

    private static final Logger log = Logger.getLogger(String.valueOf(GitHubTest.class));

    @Test
    public void correctLoginTest(){
        log.info("navigate to ");
        app.getNavigationHelper().goToLink("https://github.com");
        log.info("login as existing user");
        app.getUserHelper().userSignIn(PropertyLoader.loadProperty("user.email"),
                PropertyLoader.loadProperty("user.password"));
        log.info("Verify that user signed is successfully");
        Assert.assertTrue(app.getUserHelper().getHeadFromUserMenu().contains("Signed in as"));
        app.getUserHelper().userSignOut();
    }


    @Test
    public void unsuccessfulSignInWithInvalidEmailTest()
    {
        log.info("github.");
        app.getNavigationHelper().goToLink("https://github.com");
        log.info("login with invalid email");
        app.getUserHelper().userSignIn("withoutDoggmail.com",
                PropertyLoader.loadProperty("user.password"));
        log.info("Verify that user isn`t signed in and error message is appear");
        Assert.assertEquals(app.getUserHelper().getSignInErrorMessageText(),"Incorrect username or password.");
    }

    @Test
    public void unsuccessfulSignInWithInvalidPasswordTest()
    {
        log.info("github.");
        app.getNavigationHelper().goToLink("https://github.com");
        log.info("login with invalid password");
        app.getUserHelper().userSignIn(PropertyLoader.loadProperty("user.email"),"invalid password");
        log.info("Verify that user isn`t signed in and error message is appear");
        Assert.assertEquals(app.getUserHelper().getSignInErrorMessageText(),"Incorrect username or password.");
    }
}
