package anju_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertsexample 
{
	public static void main(String[]args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,50);
		// open application
		driver.get("http://classroom:90/webapp/");
		// wait for title
		driver.findElement(By.linkText("Hello World.html")).click();
		Thread.sleep(2000);
		//driver.navigate().to("http://classroom:90/webapp/Hello%20World.html");
		//wait for home page
		if(driver.getTitle().equals("Display Your Name"))
		{
			System.out.println("display name displayed");
		}
		WebElement age=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Click here to enter your name")));
		age.click();
		Alert a=driver.switchTo().alert();
		//click on submit
		a.sendKeys("ganga");
		a.accept();
		// driver.findElement(By.linkText("Hello%20World.html")).click();
	}

	private static TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}


}
