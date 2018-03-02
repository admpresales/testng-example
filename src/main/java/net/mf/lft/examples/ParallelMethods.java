package net.mf.lft.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;
import com.hp.lft.report.*;
import net.mf.LogMessages;
import java.util.Random;

public class ParallelMethods extends UnitTestClassBase {

    Random randomGenerator = new Random();

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

    @Test
    public void parallelMethod_One()throws GeneralLeanFtException, ReportException, InterruptedException {
        long id = Thread.currentThread().getId();
        String s = "Thread id is: " + id;
        new LogMessages().logMethod(new Object(){}, s);
        Reporter.reportEvent("Info: ", "Test: "+s);
        int x = randomGenerator.nextInt(100)*100;
        Thread.sleep(x);
        Reporter.reportEvent("Slept"+x, "");
        new LogMessages().logMethod(new Object(){}, s+" - Done");
    }
    @Test
    public void parallelMethod_Two() throws ReportException, InterruptedException {
        long id = Thread.currentThread().getId();
        String s = "Thread id is: " + id;
        new LogMessages().logMethod(new Object(){}, s);
        Reporter.reportEvent("Info: ", "Test: "+s);
        int x = randomGenerator.nextInt(100)*100;
        Thread.sleep(x);
        Reporter.reportEvent("Slept"+x, "");
        new LogMessages().logMethod(new Object(){}, s+" - Done");
    }

    @Test
    public void parallelMethod_Three() throws ReportException, InterruptedException {
        long id = Thread.currentThread().getId();
        String s = "Thread id is: " + id;
        new LogMessages().logMethod(new Object(){}, s);
        Reporter.reportEvent("Info: ", "Test: "+s);
        int x = randomGenerator.nextInt(100)*100;
        Thread.sleep(x);
        Reporter.reportEvent("Slept"+x, "");
        new LogMessages().logMethod(new Object(){}, s+" - Done");
    }

    @Test
    public void parallelMethod_Five() throws ReportException, InterruptedException {
        long id = Thread.currentThread().getId();
        String s = "Thread id is: " + id;
        new LogMessages().logMethod(new Object(){}, s);
        Reporter.reportEvent("Info: ", "Test: "+s);
        int x = randomGenerator.nextInt(100)*100;
        Thread.sleep(x);
        Reporter.reportEvent("Slept"+x, "");
        new LogMessages().logMethod(new Object(){}, s+" - Done");
    }

    @Test
    public void parallelMethod_Six() throws ReportException, InterruptedException {
        long id = Thread.currentThread().getId();
        String s = "Thread id is: " + id;
        new LogMessages().logMethod(new Object(){}, s);
        Reporter.reportEvent("Info: ", "Test: "+s);
        int x = randomGenerator.nextInt(100)*100;
        Thread.sleep(x);
        Reporter.reportEvent("Slept"+x, "");
        new LogMessages().logMethod(new Object(){}, s+" - Done");
    }

    @Test
    public void parallelMethod_Seven() throws ReportException, InterruptedException {
        long id = Thread.currentThread().getId();
        String s = "Thread id is: " + id;
        new LogMessages().logMethod(new Object(){}, s);
        Reporter.reportEvent("Info: ", "Test: "+s);
        int x = randomGenerator.nextInt(100)*100;
        Thread.sleep(x);
        Reporter.reportEvent("Slept"+x, "");
        new LogMessages().logMethod(new Object(){}, s+" - Done");
    }

}