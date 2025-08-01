package Fly91.Breathalyzer.pages;

import com.microsoft.playwright.Page;

public class UserMaster {
    private Page page;

    private final String Addnew = "//span[contains(text(), 'Add New')]";
    private final String EmpName = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[2]";
    private final String EmpCode = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[3]";
    private final String JoiningDate = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-DateInput-input')])";
    private final String Role = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Select-input')])";
    private final String Mobile = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-NumberInput-input')])";
    private final String Email = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[4]";
    private final String Password = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')])[5]";

    private final String Submit = "//span[contains(text(), 'Submit')]";
    private final String Cancel = "//span[contains(text(), 'Cancel')]";

    private final String ClickUser = "(//td[contains(@class, 'm_4e7aa4ef mantine-Table-td')])[32]";
    private final String DeactivateUser = "//span[contains(text(), 'Deactivate')]";

    private final String Search = "//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";








    public UserMaster(Page page) {
        this.page = page;
    }
    public void UserMaster() throws InterruptedException {
        page.locator(Addnew).click();
        page.locator(EmpName).fill("Dhava");
        page.locator(EmpCode).fill("PENTA001");
        page.locator(JoiningDate).click();
        page.locator(JoiningDate).type("July 31 2025");
        page.locator(Role).click();
        page.locator(Role).press("ArrowDown");
        page.locator(Role).press("Enter");
    //    page.locator(Role).selectOption("Shift Manager");
        Thread.sleep(10000);
        page.locator(Mobile).fill("9865632573");
        page.locator(Email).fill("dhava@gamail.com");
        page.locator(Password).fill("PENTA001");

        page.locator(Submit).hover();
        Thread.sleep(10000);
        page.locator(Cancel).click();
        Thread.sleep(10000);

        page.locator(ClickUser).click();
        page.locator(DeactivateUser).click();
        Thread.sleep(10000);

        page.locator(Search).fill("Nitish");
        Thread.sleep(10000);





    }
    public void doUserMaster() throws InterruptedException {
        UserMaster();
    }
}

