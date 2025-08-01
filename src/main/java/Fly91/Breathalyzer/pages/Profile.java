package Fly91.Breathalyzer.pages;

import com.microsoft.playwright.Page;

public class Profile {
    private Page page;

    private final String Profile = "(//p[contains(@class,'mantine-focus-auto m_b6d8b162 mantine-Text-root')])[2]";
    private final String ViewProfile = "//div[contains(text(),'View Profile')]";
    private final String Logout = "//div[contains(text(),'Logout')]";
    private final String Expand = "(//span[contains(@class,'m_8d3afb97 mantine-ActionIcon-icon')])[2]";



    public Profile(Page page) {
        this.page = page;
    }
    public void Profile() throws InterruptedException {
        page.locator(Profile).click();
        page.locator(ViewProfile).click();
        Thread.sleep(10000);
        page.goBack();
        page.locator(Expand).click();
        Thread.sleep(5000);
        page.locator(Profile).click();
        page.locator(Logout).click();
        Thread.sleep(10000);




    }
    public void doProfile() throws InterruptedException {
        Profile();
    }
}
