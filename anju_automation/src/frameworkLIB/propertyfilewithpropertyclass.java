package frameworkLIB;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyfilewithpropertyclass 
{
public static void main(String[]args) throws Exception
{
	Properties obj=new Properties();
	obj.load(new FileInputStream("D:\\Ganga1\\anju_automation\\package.properties"));
	String strurl=obj.getProperty("url");
	String strun=obj.getProperty("username");
	String strpwd=obj.getProperty("password");
	//
	ChromeDriver br=new ChromeDriver();
	br.navigate().to(strurl);
	br.findElement(By.name("txtUserName")).clear();
	br.findElement(By.name("txtUserName")).sendKeys(strun);
	br.findElement(By.name("txtPassword")).clear();
	br.findElement(By.name("txtPassword")).sendKeys(strpwd);
	br.findElement(By.name("Submit")).click();
	Thread.sleep(500);
	br.findElement(By.linkText("Logout")).click();
	}
}
