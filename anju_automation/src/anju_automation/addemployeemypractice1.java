package anju_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addemployeemypractice1 
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
//verify title
if(wait.until(ExpectedConditions.titleIs("OrangeHRM")))
{
	System.out.println("orange home displayed");
}
// get welcome text
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//ul[@id='option-menu']/li[1]"), "Welcome qaplanet1")))
{
	System.out.println("welcome qaplanet1 displayed");
	}
WebElement C=driver.findElement(By.linkText("Change Password"));
WebElement D=driver.findElement(By.linkText("Logout"));
if(C.isDisplayed()&&D.isDisplayed())
{
	System.out.println("change password and logout displayed");
}
// create object for pim
WebElement pim1=driver.findElement(By.linkText("PIM"));
//mouse over
Act.moveToElement(pim1).perform();
// create object for add employee
WebElement emp=driver.findElement(By.linkText("Add Employee"));
emp.click();
//switch to frame
driver.switchTo().frame("rightMenu");
// verify pim add employee
if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee"))
{
	System.out.println("PIM : Add Employee displayed");
}
// create object for save
WebElement save1=driver.findElement(By.id("btnEdit"));
//get an empid
String emp1=driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
save1.click();
Alert A=driver.switchTo().alert();
if(A.getText().equals("Last Name Empty!"))
{
	System.out.println("Last Name Empty! displayed");
	A.accept();
}
String FN="sri";
String LN="ganga";
// enter last name
driver.findElement(By.name("txtEmpLastName")).sendKeys(LN);
save1.click();
Alert A1=driver.switchTo().alert();
if(A1.getText().equals("First Name Empty!"))
{
	System.out.println("First  Name Empty! displayed");
	A1.accept();
// enter first name
	driver.findElement(By.name("txtEmpFirstName")).sendKeys(FN);
	save1.click();
	// verify personal details
	if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[contains(text(),'Personal Details')]"), "Personal Details")))
{
	System.out.println("Personal Details displayed");	
			}
	//switch to parent frame
	driver.switchTo().parentFrame();
	// mouse over
	Act.moveToElement(pim1).perform();
	// click on emp list
	driver.findElement(By.linkText("Employee List")).click();
// switch to frame
	driver.switchTo().frame("rightMenu");
	//verfy emp info
	if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Employee Information"))
	{
	System.out.println("emp info displayed");	
	}
//way1
	String name=driver.findElement(By.xpath("//table/descendant::td[contains(text(),"+emp1+")]/following-sibling::td/a")).getText();
	if(name.equals(FN+" "+LN))
{
	System.out.println("first and last name displayed");
}
	// switch to default frame
	driver.switchTo().defaultContent();
	// click on logout
	D.click();
}
	
}
	}


