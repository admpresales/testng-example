package net.mf.lft.examples;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import net.mf.LogMessages;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import unittesting.UnitTestClassBase;

public class ParallelClassesTestOne extends UnitTestClassBase {
	    @BeforeClass
	    public void beforeTestOneClass() throws ReportException {
	        long id = Thread.currentThread().getId();
			new LogMessages().logMethod(new Object(){}, "Thread id is: " + id);
			Reporter.reportEvent("Before Class - Thread id is: " + String.valueOf(id),"");
	    }
	 
	    @Test
	    public void testOne_MethodOne() throws ReportException {
	        long id = Thread.currentThread().getId();
			new LogMessages().logMethod(new Object(){}, "Thread id is: " + id);
			Reporter.reportEvent("Thread id is: " + String.valueOf(id),"");
			new LogMessages().logMethod(new Object(){}, "Thread id is: " + id+ " - Done");
	    }
	 
	    @Test
	    public void testOne_MethodTwo() throws ReportException {
	        long id = Thread.currentThread().getId();
			new LogMessages().logMethod(new Object(){}, "Thread id is: " + id);
			Reporter.reportEvent("Thread id is: " + String.valueOf(id),"");
			new LogMessages().logMethod(new Object(){}, "Thread id is: " + id+ " - Done");
	    }
	 
	    @AfterClass
	    public void afterTestOneClass() throws ReportException {
	        long id = Thread.currentThread().getId();
			Reporter.reportEvent("After Class - Thread id is: " + String.valueOf(id),"");
			new LogMessages().logMethod(new Object(){}, "Thread id is: " + id+ " - Done");
	    }
	}