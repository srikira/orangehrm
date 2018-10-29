package anju_automation;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addlocationtestcase4 
{
private static final WebElement S = null;

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
	// focus on admin(object)
	WebElement admin=driver.findElement(By.linkText("Admin"));
	// mouse over
	Act.moveToElement(admin).perform();
	Thread.sleep(500);
	// using iterator
	List<WebElement> LI=driver.findElements(By.xpath("//li[@id='admin']/ul/li/a/span"));
	Iterator<WebElement> IT=LI.iterator();
	while(IT.hasNext())
	{
		WebElement S=IT.next();
		if(S.isDisplayed())
		System.out.println(S.getText());
	Act.moveToElement(S).perform();
	Thread.sleep(500);
    WebElement sub=driver.findElement(By.xpath("//li[@id='admin']/ul/li/ul/li/a/span"));
	List<WebElement>sub1=driver.findElements(By.xpath("//li[@id='admin']/ul[1]/li[1]/ul/li/a/span"));
	Iterator<WebElement> subit=sub1.iterator();
	while(subit.hasNext())
	{
		WebElement T=subit.next();
		if(T.isDisplayed())
			System.out.println(T.getText());
		break;
		}
	}
	// click on company info
	Act.moveToElement(admin).perform();
	WebElement companyinfo=driver.findElement(By.linkText("Company Info"));
	Act.moveToElement(companyinfo).perform();
	// click on locations
		WebElement loc=driver.findElement(By.linkText("Locations"));
		loc.click();
		driver.switchTo().frame("rightMenu");
		// verify company info locations
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"), "Company Info : Locations")));
		{
			System.out.println("company info location displayed");
		}
		// verify search by
		if(driver.findElement(By.name("loc_code")).isDisplayed())
		{
			System.out.println("search by verified");
		}
		// verify search for
		if(driver.findElement(By.name("loc_name")).isDisplayed())
		{
			System.out.println("search for verified");
		}
		List<WebElement> LIST=driver.findElements(By.className("plainbtn"));
		// using iterator
		Iterator<WebElement> ITE=LIST.iterator();
		for(WebElement S:LIST)
		{
			if(S.isDisplayed())
			{
				System.out.println("list displayed");
			}
		}
		// click on add
	WebElement add=driver.findElement(By.xpath("//input[@value='Add']"));
	add.click();
		// create object for save
	WebElement save=driver.findElement(By.id("editBtn"));
	save.click();
	// switch to alert
	Alert A=driver.switchTo().alert();
	if(A.getText().equals("Please correct the following\n\n\t- Location Name has to be specified\n\t- Country should be selected!\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
{
	System.out.println("all fields verified");
}
A.accept();
// create object for timestamp
Timestamp tp=new Timestamp(System.currentTimeMillis());
String locname="hyd1"+tp;
// enter location name
driver.findElement(By.name("txtLocDescription")).sendKeys(locname);
save.click();
Alert B=driver.switchTo().alert();
if(B.getText().equals("Please correct the following\n\n\t-Country should be selected!\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
{
	System.out.println("location name has displayed");
}
B.accept();
// enter country name
driver.findElement(By.name("cmbCountry")).sendKeys("India");
save.click();
Alert C=driver.switchTo().alert();
if(B.getText().equals("Please correct the following\n\n\t- Address should be specified\n\t- Zip Code should be specified\n"))
{
	System.out.println("country name has displayed");
}
C.accept();
		// enter adddress
driver.findElement(By.name("txtAddress")).sendKeys("secunderabad");
save.click();
Alert D=driver.switchTo().alert();
if(B.getText().equals("Please correct the following\n\n\t- Zip Code should be specified\n"))
{
	System.out.println("address has displayed");
}
D.accept();
driver.findElement(By.name("txtZIP")).sendKeys("50089");
save.click();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
