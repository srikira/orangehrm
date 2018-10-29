import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class examplefirefox {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Demp\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		// open application
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		
			WebElement E=driver.findElement(By.name("txtUserName"));
			WebElement F=driver.findElement(By.name("txtPassword"));
			WebElement G=driver.findElement(By.name("Submit"));
			if(E.isDisplayed()&&E.isEnabled())
				E.sendKeys("qaplanet1");
			if(F.isDisplayed()&&F.isEnabled())
				F.sendKeys("lab1");
			if(G.isDisplayed()&&G.isEnabled())
				G.click();
			// verify welcome qaplanet1
			if(driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText().equals("welcome qaplanet1"))
			{
				
			}
			
		}
}


