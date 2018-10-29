package frameworkLIB;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class readandwriteexample 
{
public static void main(String[]args) throws JXLException, Exception
{
	WebDriver brow=new ChromeDriver();
	// maximize window
brow.manage().window().maximize();
// explicit wait
WebDriverWait wait=new WebDriverWait(brow,30);
// open application
brow.get("http://apps.qaplanet.in/qahrm/login.php");
// read file
File fs=new File("C:\\Users\\QAP36\\Desktop\\anju.xls");
Workbook g=Workbook.getWorkbook(fs);
Sheet inputsheet =g.getSheet(0);
// write data
WritableWorkbook wb=Workbook.createWorkbook(new File("C:\\Users\\QAP36\\Desktop\\anju1.xls"));
WritableSheet outputsheet=wb.createSheet("hr",0);
Label l=new Label(0,0,"username");
Label l1=new Label(1,0,"password");
Label l2=new Label(2,0,"result");
outputsheet.addCell(l);
outputsheet.addCell(l1);
outputsheet.addCell(l2);
Label x1;
Label x2;
Label x3;
// get row count
int r=inputsheet.getRows();
System.out.println(r);
for(int i=1; i<r; i++)
{
// create object for username
WebElement objun=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
objun.clear();
objun.sendKeys(inputsheet.getCell(0,i).getContents());
// create object for password
WebElement objpwd=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
objpwd.clear();
objpwd.sendKeys(inputsheet.getCell(1,i).getContents());
//click on login
WebElement log=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
log.click();
Thread.sleep(500);
String res="passed";
String res1="failed";
// verify orange hrm
if(brow.getTitle().equals("OrangeHRM"))
{
	System.out.println("login successful");
	x1=new Label(0,i,inputsheet.getCell(0,i).getContents());
	x2=new Label(1,i,inputsheet.getCell(1,i).getContents());
	x3=new Label(2,i,res);
	outputsheet.addCell(x1);
	outputsheet.addCell(x2);
	outputsheet.addCell(x3);
	// click on logout
	brow.findElement(By.linkText("Logout")).click();
}
else
{

	System.out.println("login failed");
	x1=new Label(0,i,inputsheet.getCell(0,i).getContents());
	x2=new Label(1,i,inputsheet.getCell(1,i).getContents());
	x3=new Label(2,i,res1);
	outputsheet.addCell(x1);
	outputsheet.addCell(x2);
	outputsheet.addCell(x3);
	brow.findElement(By.name("clear")).click();
}
}
wb.write();
wb.close();
}
}

