package frameworkLIB;

import java.io.File;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class singlerowdataextractfromsheet 
{
public static void main(String[]args) throws JXLException, IOException
{
	File f2=new File("C:\\Users\\QAP36\\Downloads\\123.xls");
	// to load workbook
	Workbook wb=Workbook.getWorkbook(f2);
	// to get specific sheet
	
	Sheet s2=wb.getSheet(0);
	for(int i=0; i<=1;i++)
	{
		String fg=s2.getCell(0,i).getContents();
		String io=s2.getCell(1,i).getContents();
		String nm=s2.getCell(2,i).getContents();
		String op=s2.getCell(3,i).getContents();
		String er=s2.getCell(4,i).getContents();
		System.out.println(fg);
		System.out.println(io);
		System.out.println(nm);
		System.out.println(op);
		System.out.println(er);
		
	}
	/*String r=s2.getCell(0,i).getContents();
	String k=s2.getCell(1,i).getContents();
	String j=s2.getCell(2,i).getContents();
	String l=s2.getCell(3,i).getContents();
	String m=s2.getCell(4,i).getContents();
	System.out.println(r);
	System.out.println(k);
	System.out.println(j);
	System.out.println(l);
	System.out.println(m);
	int a=1;
	String fg=s2.getCell(0,a).getContents();
	String io=s2.getCell(1,a).getContents();
	String nm=s2.getCell(2,a).getContents();
	String op=s2.getCell(3,a).getContents();
	String er=s2.getCell(4,a).getContents();
	System.out.println(fg);
	System.out.println(io);
	System.out.println(nm);
	System.out.println(op);
	System.out.println(er);
*/



}
}
