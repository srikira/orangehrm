package gangapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Domjavascriptexecutorex 
{
	public static void main(String[]args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		// open application
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		String jsU="document.getElementsByName('txtUserName')[0].value='qaplanet1'";
		js.executeScript(jsU);
		String jsP="document.getElementsByName('txtPassword')[0].value='lab1'";
		js.executeScript(jsP);
		js.executeScript("document.getElementsByName('Submit')[0].click();");
		Thread.sleep(1000);
//String Login="document.getElement(By.linkText('Logout')).click()";
WebElement logout=driver.findElement(By.linkText("Logout"));
js.executeScript("arguments[0].click();",logout);
//js.executeScript(Login);



	}

}
