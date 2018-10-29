package anju_automation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deleteex 
{
public static void main(String[]args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	// create object for actions
Actions Act=new Actions(driver);
//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,50);
//open application
			driver.get("http://apps.qaplanet.in/qahrm/login.php");
			//verify title
			if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
			{
				System.out.println("home page displayed");
			}
			WebElement UN=driver.findElement(By.name("txtUserName"));
			WebElement Password=driver.findElement(By.name("txtPassword"));
			WebElement login=driver.findElement(By.name("Submit"));
			WebElement clear=driver.findElement(By.name("clear"));
			if(UN.isDisplayed()&&Password.isDisplayed())
			{
				System.out.println("username and password displayed");
			}
			if(login.isDisplayed()&&clear.isDisplayed())
			{
				System.out.println("login and clear displayed");
	}
String U="qaplanet1";
String P="lab1";
//login to orange page
UN.clear();
UN.sendKeys(U);
Password.clear();
Password.sendKeys(P);
login.click();
//switch to frame
driver.switchTo().frame("rightMenu");

	// verify delete
	WebElement del=driver.findElement(By.xpath("//input[@value='Delete']"));
	del.click();
	//alerts
	Alert B=driver.switchTo().alert();
	driver.switchTo().alert();
	B.accept();
	// selet checkbox
driver.findElement(By.xpath("//table/descendant::td[contains(text(),'8610')]/preceding-sibling::td/input")).click();
//click on delete
del.click();
Thread.sleep(5000);
if(driver.findElement(By.xpath("//span[@class='failure']")).getText().equals("Successfully Deleted"))
{
	System.out.println("succesfully deleted displayed");
}
	new Select(driver.findElement(By.id("loc_code"))).selectByVisibleText("Emp id");
  WebElement EN=driver.findElement(By.id("loc_name"));
  EN.sendKeys("8568");
  if(driver.findElement(By.xpath("//div[@class='noresultsbar']")).getText().equals("No Records to Display"))
		  {
		 System.out.println("no records displayed");
		  }
  

	
			
}
}
