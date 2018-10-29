package gangapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class naukriexample 
{
	public static void main(String[]args)
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(op);
		//open application
		driver.get("https://www.facebook.com/");
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 70);
	
		// verify title
		if(wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up")))
		{
			System.out.println("home page displayed");
		}
	
		//create web element
		
		WebElement A=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
	
		WebElement B=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pass")));
		WebElement C=driver.findElement(By.xpath("//input[@type='submit']"));
		if(A.isDisplayed()&& B.isDisplayed())
				{
			System.out.println("email and password should be displayed");
				}
		if(C.isDisplayed())
		{
			System.out.println("login displayed");
		}
Object U="lgangasri.123@gmail.com";
Object P="bhanu1432";
// login to facebook page
A.clear();
A.sendKeys("lgangasri.123@gmail.com");
B.clear();
B.sendKeys("bhanu1432");
C.click();
WebElement D=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Home")));
D.click();
WebElement F=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userNavigationLabel")));
F.click();
WebElement E=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));
E.click();
	}


}
