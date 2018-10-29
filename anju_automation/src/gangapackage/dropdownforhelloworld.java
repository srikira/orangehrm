package gangapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownforhelloworld 
{
	public static void main(String[]args)
	{
		ChromeDriver driver=new ChromeDriver();
		// open application
		driver.get("http://classroom:90/webapp/");
	//create web element
		WebElement x=driver.findElement(By.linkText("Hello World.html"));
		x.click();
		WebElement y=driver.findElement(By.linkText("Click here to enter your name"));
        y.click();
       Alert A= driver.switchTo().alert();
       A.sendKeys("Ganga");
       A.accept();

	}

}
