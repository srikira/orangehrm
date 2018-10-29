package anju_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addemployee1sttestcase 
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
// verify orange grm
if(wait.until(ExpectedConditions.titleIs("OrangeHRM")))
{
	System.out.println();
}
// welcometext
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//ul[@id='option-menu']/li[1]"), "Welcome qaplanet1")))
{
	System.out.println("welcome displayed");
}
WebElement chang=driver.findElement(By.linkText("Change Password"));
WebElement logout=driver.findElement(By.linkText("Logout"));
if(chang.isDisplayed()&&logout.isDisplayed())
{
	System.out.println("change password and logout displayed");
}
// create object for pim
WebElement Pim=driver.findElement(By.linkText("PIM"));
// mouse over
Act.moveToElement(Pim).perform();
// click on add employee
WebElement emp=driver.findElement(By.linkText("Add Employee"));
emp.click();
// switch to frame
driver.switchTo().frame("rightMenu");
// verify pim add employee
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"), "PIM : Add Employee")))
{
	System.out.println("pim displayed");
}
// create object for save
WebElement save=driver.findElement(By.id("btnEdit"));
// get an empid
String empid=driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
save.click();
// alerts
Alert A=driver.switchTo().alert();
if(A.getText().equals("Last Name Empty!"))
{
	System.out.println("lastname displayed");
	A.accept();
}
String FN="anju";
String LN="sri";
// enter last name
driver.findElement(By.name("txtEmpLastName")).sendKeys("sri");
save.click();
Alert a1=driver.switchTo().alert();
if(a1.getText().equals("First Name Empty!"))
{
	System.out.println("lastname displayed");
	a1.accept();
}
// enter first name
driver.findElement(By.name("txtEmpFirstName")).sendKeys("anju");
save.click();
// verify personal details
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[contains(text(),'Personal Details')]"),"Personal Details" )))
		{
	System.out.println("personal details verified");
		}
// switch to frame
driver.switchTo().parentFrame();
// mouse over
Act.moveToElement(Pim).perform();
// click on emp list
WebElement emplist=driver.findElement(By.linkText("Employee List"));
emplist.click();
Thread.sleep(1000);
// switch to frame
driver.switchTo().frame("rightMenu");
// verify emp information page
if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Employee Information"))
{
	System.out.println("employee info dispplayed");
}
/*// verify emp information intable
String ST=driver.findElement(By.xpath("//table/descendant::td[contains(text(),'"+empid+"')]/following-sibling::td/a")).getText();
if(ST.equals(FN+" "+LN))
{
	System.out.println("first name and last name");
}
*/
/*// switch to default frame
driver.switchTo().defaultContent();
// logout
logout.click();
*/
WebElement name=driver.findElement(By.linkText("anju sri"));
name.click();
// verify edit
WebElement edit=driver.findElement(By.id("btnEditPers"));
edit.click();
// enter first name
WebElement W=driver.findElement(By.name("txtEmpFirstName"));
W.clear();
W.sendKeys("bhanu");
WebElement T=driver.findElement(By.name("txtEmpLastName"));
T.clear();
T.sendKeys("sree");
edit.click();
//switch to frame
driver.switchTo().parentFrame();
//mouse over
Act.moveToElement(Pim).perform();
//click on emp list
WebElement emplist1=driver.findElement(By.linkText("Employee List"));
emplist1.click();
Thread.sleep(1000);
// switch to frame
driver.switchTo().frame("rightMenu");
String STR=driver.findElement(By.xpath("//table/descendant::td[contains(text(),"+empid+")]/following-sibling::td/a")).getText();
if(STR.equals("bhanu sree"))
{
	System.out.println("bhanu and sree displayed");
}


	
}



}

