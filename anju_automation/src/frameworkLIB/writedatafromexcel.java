package frameworkLIB;

import java.io.File;
import java.io.IOException;

import jxl.JXLException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class writedatafromexcel 
{
public static void main(String[]args) throws IOException, JXLException, WriteException
{
	WritableWorkbook wb=Workbook.createWorkbook(new File("C:\\Users\\QAP36\\Desktop\\anju.xls"));
	WritableSheet gh=wb.createSheet("one", 0);
	WritableSheet er=wb.createSheet("two", 1);
	Label l=new Label(0,0,"username");
	Label l1=new Label(1,0,"password");
	Label r1=new Label(0,1,"qaplanet");
	Label r2=new Label(1,1,"admin");
	gh.addCell(l);
	gh.addCell(l1);
	gh.addCell(r1);
	gh.addCell(r2);
	wb.write();
	wb.close();


	
}
}
