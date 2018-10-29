package gangapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deletetestcase3 
{
	public static void main(String[]args) throws Exception
	{
	WebDriver driver=new ChromeDriver();
	// explict wait
	WebDriverWait wait=new WebDriverWait(driver,30);
	// object for actions
	Actions Act=new Actions(driver);
	// open application
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	// verify title
if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
	{
		System.out.println("homepage displayed");
	}
	WebElement UN=driver.findElement(By.name("txtUserName"));
	WebElement PWD=driver.findElement(By.name("txtPassword"));
	WebElement LOG=driver.findElement(By.name("Submit"));
	WebElement CLR=driver.findElement(By.name("clear"));
	if(UN.isDisplayed()&&PWD.isDisplayed())
	{
		System.out.println("username and password displayed");
	}
	if(LOG.isDisplayed()&&CLR.isDisplayed())
	{
		System.out.println("login and clear displayed");
	}
	Object User="qaplanet1";
	Object Pass="lab1";
	UN.clear();
	UN.sendKeys("qaplanet1");
	PWD.clear();
	PWD.sendKeys("lab1");
	LOG.click();
	Thread.sleep(1000);
	// switch to frame
	driver.switchTo().frame("rightMenu");
	// create object for delete
	WebElement del=driver.findElement(By.xpath("//input[@value='Delete']"));
	del.click();
	// alerts
	Alert A=driver.switchTo().alert();
	A.accept();
	// select one checkbox
	driver.findElement(By.xpath("//table/descendant::td[contains(text(),'8799')]/preceding-sibling::td/input")).click();
	del.click();
	// verify successfully deleted text
	if(driver.findElement(By.xpath("//span[@class='failure']")).getText().equals("Successfully Deleted"))
	{
		System.out.println("successfully deleted");
	}
		new Select(driver.findElement(By.id("loc_code"))).selectByVisibleText("Emp. ID");
		WebElement ST=driver.findElement(By.id("loc_name"));
		ST.sendKeys("8790");
	WebElement sel=driver.findElement(By.xpath("//input[@value='Search']"));
	sel.click();
		if(driver.findElement(By.xpath("//div[@class='noresultsbar']")).getText().equals("No Records to Display"))
				{
			System.out.println("no records");
				}
		
			
	
			
			
			
			
			
			
	
	
	
	
}
}
