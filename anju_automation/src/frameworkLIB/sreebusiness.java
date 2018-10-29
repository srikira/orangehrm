package frameworkLIB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sreebusiness 
{
@AfterClass
public void method()
{
	System.out.println("ganga");
}
@BeforeSuite
public void method2()
{
	System.out.println("sree");
}
@Test
public void method3()
{
	WebDriver driver=new ChromeDriver();
	System.out.println("webdriver");
}
}
