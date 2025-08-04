package Fly91.Breathalyzer.pages;

import com.microsoft.playwright.Page;

public class TestLogHistory {
    private Page page;

       private final String TestLogHistory = "//span[contains(text(), 'Test Log History')]";
       private final String InitiateTest = "//span[contains(text(), 'Initiate Test')]";
       private final String Airport = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Select-input')])[2]";
       private final String Department = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Select-input')])[3]";
       private final String Shift = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Select-input')])[4]";
       private final String Timings = "(//input[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Select-input')])[5]";
       private final String Names = "(//input[contains(@class, 'mantine-TagsInput-inputField m_45c4369d mantine-PillsInputField-field')])[1]";
       private final String Reason = "//textarea[contains(@class, 'm_8fb7ebe7 mantine-Input-input mantine-Textarea-input')]";
       private final String EmailRecipients = "(//input[contains(@class, 'mantine-TagsInput-inputField m_45c4369d mantine-PillsInputField-field')])[2]";

       private final String Submit = "//span[contains(text(),'Submit')]";
       private final String Cancel = "//span[contains(text(),'Cancel')]";
       private final String Done = "//span[contains(text(),'Done')]";
       private final String Rerun = "//span[contains(text(),'Re-run')]";
       private final String RerunReason = "//textarea[contains(@class,'m_8fb7ebe7 mantine-Input-input mantine-Textarea-input')]";
       private final String Confirm = "//span[contains(text(),'Confirm')]";
       private final String RerunDone = "//span[contains(text(),'Done')]";

       private final String Pagination = "(//span[contains(@class,'m_8d3afb97 mantine-ActionIcon-icon')])[6]";


       private final String Search = "//input[contains(@class,'m_8fb7ebe7 mantine-Input-input mantine-TextInput-input')]";

       private final String AirportFilter = "//input[contains(@class,'m_8fb7ebe7 mantine-Input-input mantine-Select-input')]";
       private final String Fromdate = "//span[contains(text(),'From Date')]";
       private final String Previousmonth = "(//button[contains(@class,'mantine-focus-auto m_2351eeb0 mantine-DatePickerInput-calendarHeaderControl m_87cf2631 mantine-UnstyledButton-root')])[1]";
       private final String FromdateSelect = "(//button[contains(@class,'mantine-focus-auto m_396ce5cb mantine-DatePickerInput-day m_87cf2631 mantine-UnstyledButton-root')])[2]";
       private final String Todate = "//span[contains(text(),'To Date')]";
       private final String PreviousmonthTO = "(//button[contains(@class,'mantine-focus-auto m_2351eeb0 mantine-DatePickerInput-calendarHeaderControl m_87cf2631 mantine-UnstyledButton-root')])[1]";
       private final String TodateSelect = "(//button[contains(@class,'mantine-focus-auto m_396ce5cb mantine-DatePickerInput-day m_87cf2631 mantine-UnstyledButton-root')])[32]";
       private final String Download = "//span[contains(text(),'Download')]";


       private final String SpecificTestLog = "(//td[contains(@class,'m_4e7aa4ef mantine-Table-td')])[4]";









    public TestLogHistory(Page page) {
        this.page = page;
    }
    public void TestLogHistory() throws InterruptedException {
        page.locator(TestLogHistory).click();
        page.locator(InitiateTest).click();
        page.locator(Airport).click();
        page.locator(Airport).press("ArrowDown");
        page.locator(Airport).press("Enter");
        page.locator(Department).click();
        page.locator(Department).press("ArrowDown");
        page.locator(Department).press("Enter");
        page.locator(Shift).click();
        page.locator(Shift).press("ArrowDown");
        page.locator(Shift).press("Enter");
        page.locator(Timings).click();
        page.locator(Timings).press("ArrowDown");
        page.locator(Timings).press("Enter");
        page.locator(Names).fill("Arjun, Meera, Rahul, Kavya, Nikhil, Ananya, Suresh, Priya, Rohan, Divya");
        page.locator(Reason).fill("Test");
        page.locator(EmailRecipients).fill("dhavavarrshini.m@pentafox.in");
        Thread.sleep(10000);
    //    page.locator(Submit).click();
        page.locator(Cancel).click();
        /*page.locator(Done).click();
        page.locator(Rerun).click();
        page.locator(RerunReason).fill("Test");
        page.locator(Confirm).click();*/
    //    page.locator(Search).fill("Security");
        Thread.sleep(10000);

        page.locator(Pagination).click();

        page.locator(AirportFilter).click();
        page.locator(AirportFilter).press("ArrowDown");
        page.locator(AirportFilter).press("Enter");
        /*page.locator(Fromdate).click();
        page.locator(Previousmonth).click();
        page.locator(FromdateSelect).nth(1).click();
        page.locator(Todate).click();
        page.locator(PreviousmonthTO).click();
        page.locator(TodateSelect).nth(1).click();*/
        page.locator(Download).hover();
        Thread.sleep(10000);


        page.locator(SpecificTestLog).click();
        Thread.sleep(10000);
        page.goBack();








    }
    public void doTestLogHistory() throws InterruptedException {
        TestLogHistory();
    }
}
