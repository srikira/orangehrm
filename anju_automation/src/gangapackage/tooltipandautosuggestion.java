package gangapackage;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltipandautosuggestion 
{
public static void main(String[]args)
{
	WebDriver driver =new ChromeDriver();
	// apply time
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// open application
	driver.get("https://www.google.com/");
	WebElement se=driver.findElement(By.id("lst-ib"));
	se.sendKeys("selenium");
	// create an webelement
	WebElement E=driver.findElement(By.className("sbsb_b"));
	List<WebElement> li=E.findElements(By.tagName("li"));
	// using iterator
Iterator<WebElement> IT=li.iterator();
while(IT.hasNext())                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		{
	WebElement S=IT.next();
	String T=S.getText();
	System.out.println(T);
	if(T.equals("selenium webdriver"))
	{
		E.click();
		break;
	}
		}
	

}
}
