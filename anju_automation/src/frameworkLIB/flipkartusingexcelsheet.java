package frameworkLIB;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartusingexcelsheet 
{
	public static void main(String[]args) throws Exception
	{
WebDriver brow=new ChromeDriver();
// maximize window
brow.manage().window().maximize();
// explicit wait
WebDriverWait wait=new WebDriverWait(brow,20);
// actions
Actions Act=new Actions(brow);
// open application
brow.navigate().to("https://www.flipkart.com");
// verify title
if(wait.until(ExpectedConditions.titleIs("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Exclusive Offers!")))
		{
	System.out.println("title displayed");
		}
// create webelement for login
WebElement log=brow.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
log.click();
// mouse over on electronics
WebElement ele=brow.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
Act.moveToElement(ele).perform();
Thread.sleep(500);
WebElement sam=brow.findElement(By.xpath("//*[@id='container']/div/header/div[3]/ul/li[1]/ul/li/ul/li[1]/ul/li[4]/a"));
sam.click();
Thread.sleep(500);
WebElement viw=brow.findElement(By.linkText("VIEW ALL"));
viw.click();
Thread.sleep(500);
WebElement hl=brow.findElement(By.xpath("//div[contains(text(),'Price -- High to Low')]"));
hl.click();
List<WebElement> Li= brow.findElements(By.xpath("//div[@class='_3wU53n']"));
// using for loop
int r=Li.size();
for(int i=0; i<r; i++)
{
	System.out.println(Li.get(i).getText());
}
// create list for price
List<WebElement> pr=brow.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
// using iterator
Iterator<WebElement> it=pr.iterator();
while(it.hasNext())
{
	System.out.println(it.next().getText());
	}
{
	do
	{
List<WebElement> num=brow.findElements(By.xpath("//div[@class='_3wU53n']"));
// using for each
for(WebElement sub:num)
{
	if(sub.isDisplayed())
	{
		System.out.println("  -"+sub.getText());
	}
	}
if(brow.findElement(By.xpath("//span[contains(text(),'Next')]")).isEnabled())
{
	brow.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
}
else
{
	System.out.println("next not present");
	}
	}while(brow.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed());
}
	}
}




	
		
		
	


