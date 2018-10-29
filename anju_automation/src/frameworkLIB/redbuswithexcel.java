package frameworkLIB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class redbuswithexcel 
{
public static void main(String[]args) throws Exception
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver brow= new ChromeDriver(options);
// maximize window
	brow.manage().window().maximize();
	// actions
	Actions act=new Actions(brow);
	// apply wait
	WebDriverWait wait=new WebDriverWait(brow,20);
	// open application
	brow.navigate().to("https://www.redbus.in");
	// create webelement for from
	WebElement frm=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("src")));
	frm.sendKeys("Hyderabad");
	frm.sendKeys(Keys.ENTER);
	WebElement to=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dest")));
	to.sendKeys("Bangalore");
	to.sendKeys(Keys.ENTER);
	Thread.sleep(500);
//WebElement date=wait.until(ExpectedConditions.presenceOfElementLocated(By.className("db text-trans-uc")));
WebElement onward=brow.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[6]"));
onward.click();
Thread.sleep(1000);
//WebElement ret=brow.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr[7]/td[2]"));
//ret.click();
//ret.sendKeys(Keys.ENTER);
//Thread.sleep(1000);
WebElement search=brow.findElement(By.id("search_btn"));







{
	
}

	

	


	
	
	
	
}
}
