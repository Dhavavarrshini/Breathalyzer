package Fly91.Breathalyzer.tests;

import Fly91.Breathalyzer.pages.Login;
import Fly91.Breathalyzer.pages.Profile;
import Fly91.Breathalyzer.pages.TestLogHistory;
import Fly91.Breathalyzer.pages.UserMaster;
import com.microsoft.playwright.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BreathalyzerRunner {
    private static final Logger log = LoggerFactory.getLogger(BreathalyzerRunner.class);
    Playwright playwright;
    Browser browser;
    Page page;

    @BeforeMethod
    public void setup() throws InterruptedException {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        BrowserContext context = browser.newContext();
        page = context.newPage();
        page.navigate("https://breathalyzer.pentafox.in/");


    }
    @Test
    public void RedcapRunner() throws InterruptedException {
        Login login = new Login(page);
        login.doLogin();

        UserMaster userMaster = new UserMaster(page);
        userMaster.doUserMaster();

         TestLogHistory testLogHistory = new TestLogHistory(page);
        testLogHistory.doTestLogHistory();

        Profile profile = new Profile(page);
        profile.doProfile();


    }
    @AfterMethod
    public void tearDown() {
        browser.close();
        playwright.close();
    }
}
