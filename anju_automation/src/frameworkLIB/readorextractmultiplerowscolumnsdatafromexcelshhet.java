package frameworkLIB;

import java.io.File;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
public class readorextractmultiplerowscolumnsdatafromexcelshhet 
{
public static void main(String[]args) throws JXLException, IOException
{
	// to take files as input
	File f1=new File("C:\\Users\\QAP36\\Downloads\\123.xls");
	// to load workbook
	Workbook WB=Workbook.getWorkbook(f1);
	// get specific sheet
	Sheet s1=WB.getSheet(1);
	int i=0;
	String T=s1.getCell(i,0).getContents();
	String q=s1.getCell(i,1).getContents();
	String r=s1.getCell(i,2).getContents();
	String g=s1.getCell(i,3).getContents();
	System.out.println(T);
	System.out.println(q);
	System.out.println(r);
	System.out.println(g);
int j=1;
	String zu=s1.getCell(j,0).getContents();
	String xy=s1.getCell(j,1).getContents();
	String sd=s1.getCell(j,2).getContents();
	String io=s1.getCell(j,3).getContents();
	System.out.println(zu);
	System.out.println(xy);
	System.out.println(sd);
	System.out.println(io);
}
}
