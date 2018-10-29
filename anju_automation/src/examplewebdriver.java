import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class examplewebdriver {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	// to maximize browser
	driver.manage().window().maximize();
	// open application
	driver.get("http://apps.qaplanet.in/qahrm/login.php");
	// enter username
	driver.findElement(By.name("txtUserName")).clear();
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	// enter password
	driver.findElement(By.name("txtPassword")).clear();
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	// click on login
	driver.findElement(By.name("Submit")).click();
	// click on logout
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
		}

}
