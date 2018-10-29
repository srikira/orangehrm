package anju_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deleteandeditemployee 
{
	public static void main(String[]args)
	{
		ChromeDriver driver=new ChromeDriver();
		// explicit wait
		WebDriverWait wait=new WebDriverWait(driver,50);
			// create object for actions
			Actions Act=new Actions(driver);
		// open application
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
// login to orange page
UN.clear();
UN.sendKeys(U);
Password.clear();
Password.sendKeys(P);
login.click();
// switch to frame
driver.switchTo().frame("rightMenu");
WebElement g1=driver.findElement(By.xpath("//table/descendant::td[contains(text(),'8566')]/following-sibling::td[1]/a"));
g1.click();
// verify edit
driver.findElement(By.className("editbutton")).click();
{
	System.out.println("edit displayed");
}

WebElement AB=driver.findElement(By.name("txtEmpFirstName"));
WebElement CD=driver.findElement(By.name("txtEmpLastName"));
String Firstname="anju";
String Lastname="anjana";
AB.clear();
AB.sendKeys(Firstname);
CD.clear();
CD.sendKeys(Lastname);
//driver.findElement(By.name("txtEmpLastName")).sendKeys(Lastname);
//create object for save
WebElement save1=driver.findElement(By.className("savebutton"));
save1.click();
// switch to frame
driver.switchTo().defaultContent();
// create object for pim
WebElement pim2=driver.findElement(By.linkText("PIM"));
//mouse over
Act.moveToElement(pim2).perform();
// click on emp list
driver.findElement(By.linkText("Employee List")).click();
//switch to frame
driver.switchTo().frame("rightMenu");
String Y=driver.findElement(By.xpath("//table/descendant::td[contains(text(),'8566')]/following-sibling::td[1]/a")).getText();
if(Y.equals(Firstname +" "+Lastname ))
{
	System.out.println("change details");
}



{
}
	}

}
