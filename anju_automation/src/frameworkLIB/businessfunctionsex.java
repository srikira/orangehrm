package frameworkLIB;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class businessfunctionsex 
{
	WebDriver brow;
	WebDriverWait wait;
	WebElement objun;
	WebElement objpwd;
	// driver configuration
	public void configdriver(String browser)
	{
if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Demp\\geckodriver.exe");
		brow=new FirefoxDriver();
		}
	else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Selenium_Demp\\IEDriverServer.exe");
			InternetExplorerOptions caps=new InternetExplorerOptions();
			// it will avoid security domain warning message
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			// it will accept ssl cerificate
			caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			brow=new InternetExplorerDriver(caps);
		}
	else if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver_win32 (1)\\chromedriver.exe");
		brow=new ChromeDriver();
	}
	else
	{
		System.out.println("invalid driver");
	}
wait=new WebDriverWait(brow,30);
brow.manage().window().maximize();
	}
	// close browser
	public void closebrowser()
	{
		brow.close();
	}
	// quit object
	public void quitobject()
	{
		brow.quit();
	}
// open application
	public void openapp(String URL)
	{
		brow.get(URL);
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		// verify homepage
		assertEquals(brow.getTitle(),"OrangeHRM - New Level of HR Management");
		Reporter.log("homepage displayed");
		// create object for un,pswd
		objun=brow.findElement(By.name("txtUserName"));
		objpwd=brow.findElement(By.name("txtPassword"));
	}
		// login to the application
		public void logintoorangehrm(String username,String password)
		{
			objun.clear();
			objun.sendKeys(username);
			objpwd.clear();
			objpwd.sendKeys(password);
		// click on login
			brow.findElement(By.name("Submit")).click();
			wait.until(ExpectedConditions.titleIs("OrangeHRM"));
			// verify orange hrm page
			assertEquals(brow.getTitle(), "OrangeHRM");
			Reporter.log("orange hrm page displayed");
			//get welcome text
			String weltext=brow.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
			//verify welcome text
			assertEquals(weltext, "Welcome "+username);
		}
		// logout app
		public void logoutfromapp()
		{
			// click on logout
			brow.findElement(By.linkText("Logout")).click();
			wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
			// verify homepage
			assertEquals(brow.getTitle(), "OrangeHRM - New Level of HR Management");
			Reporter.log("sign off successfull and orange page displayed");
			// add employee
		}
			public void  addemployee()
			{
				Reporter.log("add employee");
			}
		
	}

	


	





