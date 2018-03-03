# testng-example
There are profiles set up for use for when you execute (all suite xml files in src/main/resources:
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
