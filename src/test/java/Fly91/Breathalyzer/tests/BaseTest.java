package Fly91.Breathalyzer.tests;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeClass
    public void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)  // set to true if you don't need UI
        );
    }

    @BeforeMethod
    public void createContext() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterMethod
    public void closeContext() {
        if (context != null) {
            context.close();
        }
    }

    @AfterClass
    public void closeBrowser() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}
