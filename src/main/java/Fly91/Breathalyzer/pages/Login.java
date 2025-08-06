package Fly91.Breathalyzer.pages;

import com.microsoft.playwright.Page;

public class Login {
    private Page page;

     private final String EmpID    = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";
     private final String Password = "//input[contains(@class, 'm_f2d85dd2 mantine-PasswordInput-innerInput')]";
     private final String Login    = "//span[contains(@class, 'm_80f1301b mantine-Button-inner')]";






    public Login(Page page) {
        this.page = page;
    }
    public void Login() throws InterruptedException {
        page.locator(EmpID).fill("EMP001");
        page.locator(Password).fill("test");
        page.locator(Login).click();
        Thread.sleep(10000);

    }





    public void doLogin() throws InterruptedException {
        Login();
    }
}