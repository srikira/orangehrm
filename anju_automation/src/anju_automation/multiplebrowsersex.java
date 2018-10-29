package anju_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multiplebrowsersex 
{
public static void main(String[]args) throws Exception
{
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("http://qaplanet.in/");
	WebDriverWait wait=new WebDriverWait(driver,50);
	// click on linkedlin
	driver.findElement(By.xpath("//div[@id='section-tophat']/div/div/div[2]/ul/li[4]/a/img")).click();
	Thread.sleep(5000);
	Set<String> sr=driver.getWindowHandles();
	//way1
	for(String s:sr)
	{
		System.out.println(s);
	}

	// way2
	Iterator<String> it= sr.iterator();
	String Firstid =it.next();
	String secondid =it.next();
	//switch to second browser
	driver.switchTo().window(secondid);
	// click on sign in 
	driver.findElement(By.linkText("Sign in")).click();
	Thread.sleep(1000);
	//enter email
	driver.findElement(By.name("session_key")).sendKeys("lgangasri@gmail.com");
	Thread.sleep(1000);
driver.close();
//switch to parent tab
driver.switchTo().window(Firstid);
// click on jusdial
Thread.sleep(1000);

driver.findElement(By.xpath("//div[@id='section-tophat']/div/div/div[2]/ul/li[5]/a/img")).click();
Thread.sleep(2000);
//driver.close();

}
}
