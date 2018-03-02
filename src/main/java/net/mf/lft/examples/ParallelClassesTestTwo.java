package net.mf.lft.examples;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import net.mf.LogMessages;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import unittesting.UnitTestClassBase;

public class ParallelClassesTestTwo extends UnitTestClassBase {
	@BeforeClass
	public void beforeTestTwoClass() throws ReportException {
		long id = Thread.currentThread().getId();
		new LogMessages().logMethod(new Object(){}, "Thread id is: " + id);
		Reporter.reportEvent("Thread id is: " + String.valueOf(id),"");
	}

	@Test
	public void testTwo_MethodOne() throws ReportException {
		long id = Thread.currentThread().getId();
		new LogMessages().logMethod(new Object(){}, "Thread id is: " + id);
		Reporter.reportEvent("Thread id is: " + String.valueOf(id),"");
		new LogMessages().logMethod(new Object(){}, "Thread id is: " + id+ " - Done");
	}

	@Test
	public void testTwo_MethodTwo() throws ReportException {
		long id = Thread.currentThread().getId();
		Reporter.reportEvent("Thread id is: " + String.valueOf(id),"");
		new LogMessages().logMethod(new Object(){}, "Thread id is: " + id+ " - Done");
	}

	@AfterClass
	public void afterTestTwoClass() throws ReportException {
		long id = Thread.currentThread().getId();
		Reporter.reportEvent("Thread id is: " + String.valueOf(id),"");
		new LogMessages().logMethod(new Object(){}, "Thread id is: " + id+ " - Done");

	}
	}