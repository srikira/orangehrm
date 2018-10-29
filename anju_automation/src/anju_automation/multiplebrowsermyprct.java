package anju_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplebrowsermyprct 
{
public static void main(String[]args) throws Exception
{
	WebDriver driver=new ChromeDriver();
	// open application
	driver.navigate().to("http://qaplanet.in/");
	// click on linkedin
	driver.findElement(By.xpath("//div[@id='section-tophat']/div/div/div[2]/ul/li[4]/a/img")).click();
	Set<String> st=driver.getWindowHandles();
	Iterator<String> IT=st.iterator();
	String first_id=IT.next();
	String second_id=IT.next();
	// switch to window
	driver.switchTo().window(second_id);
	Thread.sleep(1000);
	driver.findElement(By.linkText("Sign in")).click();
	Thread.sleep(1000);
// enter login name
	driver.findElement(By.name("session_key")).sendKeys("lgangasri@gmail.com");
	driver.close();
	Thread.sleep(1000);
//switch to first id
	driver.switchTo().window(first_id);
	// click on jusdial
	driver.findElement(By.xpath("//div[@id='section-tophat']/div/div/div[2]/ul/li[5]/a")).click();
	
	
	
	

}
}
