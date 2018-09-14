# testng-example
This test is an example of how you can utilize the parallel execution of LeanFT in a TestNG framework.  It is a shell of a test demonstrating the bare capabilities and doesn't rely on any application for execution.


In order to execute the test, you must select one of the profiles.  **ONLY** select one profile at a time for execution.  There are no checks if multiple are selected.  Things won't crash but only the last profile selected in the list will be executed.

These profiles are set up for use for when you execute (all suite xml files in src/main/resources) to demonstrate various ways parallel execution can be done:
```
  Data Provider - uses the testng.xml file to run the net.mf.lft.examples.DataProviderExampleTest (this is the default if no profile selected)
  
  Parallel Classes - uses classes-test-testing.xml to run ParallelClassesTestOne, ParallelClassesTestTwo, ParallelClassesTestThree
  
  Parallel Methods - uses methods-test.testing.xml to run ParallelMethods
  
  Suite w/Parameters - uses automation-suite.xml to run Automation_01 and Automation_02 passing arguments from the xml to the test.
  ``` 


Make sure to read the *.xml files that is in the project as it tells how to properly execute from eclipse

Two good sources on explaining how to execute TestNG tests in parallel (class, test, method)

* http://howtodoinjava.com/testng/testng-executing-parallel-tests/
* http://stackoverflow.com/questions/24216163/configure-parallel-execution-of-tests-and-classes-in-testng-xml

Reference on how to pass arguments from the xml file

* http://howtodoinjava.com/testng/testng-test-parameters-through-testng-xml-and-parameters-annotation/

* http://www.seleniumeasy.com/maven-tutorials/choose-selected-testng-xml-files-to-execute-using-maven
* http://www.seleniumeasy.com/maven-tutorials/how-to-execute-selenium-webdriver-testng-xml-using-maven
