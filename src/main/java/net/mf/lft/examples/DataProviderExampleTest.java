package net.mf.lft.examples;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.GeneralLeanFtException;
import net.mf.LogMessages;
import org.testng.annotations.*;
import unittesting.UnitTestClassBase;

public class DataProviderExampleTest extends UnitTestClassBase {
    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    // Runs in parallel when set to true
    // otherwise it runs in serial
    @DataProvider(name="TestNamesData", parallel=true)
    public Object[][] getTestNamesData() {
        return new Object[][]{
                {"Larry", 2000},
                {"Curly", 3000},
                {"Moe", 1000},
                {"Shemp", 4000},
                {"Tom", 2500},
                {"Jerry", 5000}
        };
    }

    @Test(dataProvider = "TestNamesData")
    public void parallelTest(String nameOfPerson, int sleepTime) throws GeneralLeanFtException, ReportException, InterruptedException {
        new LogMessages().logMethod(new Object(){}, nameOfPerson+"  Sleep time (ms): "+String.valueOf(sleepTime));

        Reporter.reportEvent("Info: "+nameOfPerson, "Test: Thread id = " + Thread.currentThread().getId());

        Thread.sleep(sleepTime);
        new LogMessages().logMethod(new Object(){}, nameOfPerson+"   Done");
        Reporter.reportEvent("done", "");
    }
}