package anju_automation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testngexampl 
{
@Test
public void method1()
{
System.out.println("method1");	
}
@AfterClass
public void method2()
{
	System.out.println("method2");
}
@Test
public void method3()
{
	System.out.println("method3");
	Reporter.log("testng framework");
}
@BeforeClass
public void method4()
{
	System.out.println("method4");
	Reporter.log("testng framework");
}
}
