package frameworkLIB;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apachipoiexamwrite
{
public static void main(String[]args) throws IOException
{
XSSFWorkbook	wb=new XSSFWorkbook();
XSSFSheet sheet=wb.createSheet("abc");
XSSFSheet sheet1=wb.createSheet("def");
int row=0;
int column=0;                                                           
Row r1=sheet.createRow(row);
Row r2=sheet1.createRow(row);
r1.createCell(column).setCellValue("mobile");
column ++;
r1.createCell(column).setCellValue( "price");
column++;
r1.createCell(column).setCellValue("model");
r2.createCell(column).setCellValue("mobile");
column--;
r2.createCell(column).setCellValue("price");
column--;
r2.createCell(column).setCellValue("model");
FileOutputStream fp=new FileOutputStream("C:\\Users\\QAP36\\Downloads\\anjana56.xls") ;
wb.write(fp);
}
}
