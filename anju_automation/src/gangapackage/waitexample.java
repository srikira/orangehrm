package gangapackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class waitexample 
{
	public static void main(String[]args)
	{
		ChromeDriver driver=new ChromeDriver();
		// wait object
		WebDriverWait wait=new WebDriverWait(driver,70);
		// open application
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//maximize window
		driver.manage().window().maximize();
		// verify title
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("homepage displayed");
		}
		//wait title
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
	//create web element
		WebElement a=driver.findElement(By.name("txtUserName"));
		WebElement b=driver.findElement(By.name("txtPassword"));
		WebElement c=driver.findElement(By.name("Submit"));
		if(a.isDisplayed()&&b.isDisplayed()&&c.isDisplayed())
		{
			System.out.println("username and password and submit displayed");
			
		}

		//login to orange page
		String A="qaplanet1";
		String B="lab1";
		a.clear();
		a.sendKeys("qaplanet1");
		b.clear();
		b.sendKeys("lab1");
		c.click();
	//verify title
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("home");
		}
		//verify welcome qaplanet1
if(driver.findElement(By.xpath("//div[@id='option-menu-bar']/ul/li[1]")).getText().equals("Welcome qaplanet1"))
		{
			System.out.println("Welcome qaplanet1");
		}
		//wait for text present
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='option-menu-bar']/ul/li[1]"), "Welcome qaplanet1"));
	
	WebElement h=driver.findElement(By.linkText("Change Password"));
	{
if(h.isDisplayed())
	{
	System.out.println("change password displayed");	
}
//wait for element is enabled
wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Change Password")));
	}
	
}
}
		
	
	
	


