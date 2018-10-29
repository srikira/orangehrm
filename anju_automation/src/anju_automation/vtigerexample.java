package anju_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vtigerexample 
{
	public static void main(String[]args)
	{
		ChromeDriver driver=new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		//open application
		driver.get("http://classroom:8888/index.php?action=Login&module=Users");
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,60);
	//verify title
		if(wait.until(ExpectedConditions.titleIs("vtiger CRM 5 - Commercial Open Source CRM")))
		{
			System.out.println("home page displayed");
		}
		WebElement AB=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("user_name")));
		WebElement CD=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("user_password")));
		WebElement EF=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitButton")));
if(AB.isDisplayed()&&CD.isDisplayed())
{
	System.out.println("username and password displayed");
}
if(EF.isDisplayed())
{
	System.out.println("login displayed");
}
	String U="qaplanet1";
	String N="lab1";
	// login to vtiger page
	AB.clear();
	AB.sendKeys("qaplanet1");
	CD.clear();
	CD.sendKeys("lab1");
	EF.click();
/*	Actions A=new Actions(driver);
	WebElement Z=driver.findElement(By.xpath("//td[@class='small']/img"));
	A.moveToElement(Z).perform();
	WebElement h=driver.findElement(By.linkText("Sign Out"));
	h.click();
*/
	
	}

}
