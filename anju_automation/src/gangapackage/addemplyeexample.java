package gangapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class addemplyeexample 
{
public static void main(String[]args)
{
	ChromeDriver driver=new ChromeDriver();
	//maximize window
	driver.manage().window().maximize();
	//explicit wait
	WebDriverWait wait=new WebDriverWait(driver,50);
	//Actions class object
	Actions Act=new Actions(driver);
//open application
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	//verify application
	if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
	{
		System.out.println("home page displayed");
	}
	else
	{
		System.out.println("home page failed to open");
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
String UN1="qaplanet1";
String PW1="lab1";
//login to orange page
UN.clear();
UN.sendKeys(UN1);
PWD.clear();
PWD.sendKeys(PW1);
LOG.click();
//verify orange hrm page
if(wait.until(ExpectedConditions.titleIs("OrangeHRM")))
{
	System.out.println("orange page displayed");
}
// get welcome text
if(driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText().equals("Welcome qaplanet1"))
		{
	System.out.println("Welcome qaplanet1 diplayed");
		}
WebElement CG=driver.findElement(By.linkText("Change Password"));
WebElement logut=driver.findElement(By.linkText("Logout"));
if(CG.isDisplayed()&&logut.isDisplayed())
{
	System.out.println("changed password and logout displayed");
}
//create webelement for PIM
WebElement PIM1=driver.findElement(By.linkText("PIM"));
//mouse over
Act.moveToElement(PIM1).perform();
//click on add employee
driver.findElement(By.linkText("Add Employee")).click();
//switch to frame
driver.switchTo().frame("rightMenu");
// verify pim add employee
if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee"))
{
	System.out.println("PIM : Add Employee displayed");
}
//create webelement for save button
WebElement save1=driver.findElement(By.id("btnEdit"));
// get employee id
String AB=driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
//click on save
save1.click();
//wait for alert
Alert A=wait.until(ExpectedConditions.alertIsPresent());
if(A.getText().equals("Last Name Empty!"))
{
	System.out.println("Last Name Empty! displayed");
	A.accept();
}
	String FN="ganga";
	String LN="sri";
	//enter last name
	driver.findElement(By.name("txtEmpLastName")).sendKeys("sri");
	save1.click();
//wait for alert
	Alert A1=wait.until(ExpectedConditions.alertIsPresent());
if(A1.getText().equals("First Name Empty!"))
{
	System.out.println("First Name Empty! displayed");
	A1.accept();
}
	//enter first name
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("ganga");
	save1.click();
	
//wait for personal details
if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"),"Personal Details")))
		{
	System.out.println("person details displayed");
		}
		//switch to frame
driver.switchTo().parentFrame();
//mouse over on
Act.moveToElement(PIM1).perform();
//click on employee list
driver.findElement(By.linkText("Employee List")).click();
// switch to frame
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
// verify employee info
if(driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Employee Information"))
		{
	System.out.println("Employee Information displayed");
		}
//get row count
int rc=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
int i;
for(i=1;i<=rc;i++)
{
	//Get second column data
	String sEmpID=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
	//Get third column data
	String sEmpName=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
	if(sEmpID.equals(save1) && sEmpName.equals(FN+" "+LN))
	{
		System.out.println(save1+", "+sEmpName+" displayed at: "+i);
		break;
	}
}
		//switch to top frame
				driver.switchTo().defaultContent();
				//--------------------------------------------------------------------------
				//Click on logout
				logut.click();
		//Verify home page
				if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
				{
					System.out.println("Signoff sucessfull & Home Page Displayed");
				}
	
	}}







		
		







