package anju_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
			System.out.println("title is displayed");
		else
			System.out.println("failed");
		WebElement un=driver.findElement(By.name("txtUserName"));
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login=driver.findElement(By.name("Submit"));
		WebElement clear=driver.findElement(By.name("clear"));
		if (un.isDisplayed()&& un.isEnabled())
		{
			System.out.println("un is displayed");
			un.clear();
			un.sendKeys("qaplanet1");
		}
		if (pwd.isDisplayed()&& pwd.isEnabled())
		{
			System.out.println("pwd is displayed");
			pwd.sendKeys("lab1");
		}
		Thread.sleep(1000);
		if (clear.isDisplayed()&& clear.isEnabled())
		{
			System.out.println("clear is displayed");
			clear.click();
		}
		Thread.sleep(1000);
		un.sendKeys("qaplanet1");
		pwd.sendKeys("lab1");
		if (login.isDisplayed()&& login.isEnabled())
		{
			System.out.println("login is displayed");
			login.click();
		}
		if(driver.getTitle().equals("OrangeHRM"))
			System.out.println("title is displayed");
		else
			System.out.println("failed");
		String wel=driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
		if(wel.equals("Welcome qaplanet1"))
		{
			System.out.println("welcome is displayed");
		}
		boolean cp=driver.findElement(By.linkText("Change Password")).isDisplayed();
		System.out.println(cp);
	}

}
