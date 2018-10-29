package gangapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownexample1 
{
	public static void main(String[]args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		//open application
		driver.get("http://classroom:90/webapp/");
		WebElement e=driver.findElement(By.linkText("SelectAWebSite.html"));
		e.click();
	 // drop down element by using name
		new Select(driver.findElement(By.name("OptWeb"))).selectByVisibleText("QAPlanet");
//drop down element by using index
		Thread.sleep(1000);
		new Select(driver.findElement(By.name("OptWeb"))).selectByValue("Microsoft");
// drop down element by using value
		Thread.sleep(1000);
		new Select(driver.findElement(By.name("OptWeb"))).selectByIndex(1);
		

	}

}
