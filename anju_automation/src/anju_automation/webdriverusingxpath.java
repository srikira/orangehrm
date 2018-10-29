package anju_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverusingxpath 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// open application
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//verify title
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("home page displayed");
		}
		else
		{
			System.out.println("homepage failed to open");
		}
		//create webelement
		WebElement a=driver.findElement(By.name("txtUserName"));
		WebElement b=driver.findElement(By.name("txtPassword"));
		WebElement c=driver.findElement(By.name("Submit"));
		WebElement d=driver.findElement(By.name("clear"));
		if(a.isDisplayed()&&b.isDisplayed())
		{
			System.out.println("username and password displayed");
		}
		if(c.isDisplayed()&&d.isDisplayed())
		{
			System.out.println("login and clear displayed");
		}
		Object UN="qaplanet1";
		Object PWD="lab1";
		// login to orange page
		a.clear();
		a.sendKeys("qaplanet1");
		b.clear();
		b.sendKeys("lab1");
		c.click();
		//verify title
		driver.getTitle().equals("OrangeHRM");
		{
			System.out.println("orange page displayed");
		}
		//verify welcome qaplanet1
		if(driver.findElement(By.xpath("//div[@id='option-menu-bar']/ul/li")).getText().equals("Welcome qaplanet1"))
		{
			System.out.println("welcome qaplanet1");
		}
		WebElement E=driver.findElement(By.linkText("Change Password"));
		WebElement F=driver.findElement(By.linkText("Logout"));
		if(E.isDisplayed()&&F.isDisplayed())
		{
			System.out.println("changepassword and logout displayed");
		}
		
		//verify home page
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("sign off succesfull & homepage displayed");
		}
		driver.close();
driver.quit();
		}
	}


