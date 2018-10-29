package frameworkLIB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readpoiexample 
{
public static void main(String[]args) throws IOException
{
	InputStream excelfiletoread=new FileInputStream("C:\\Users\\QAP36\\Downloads\\123.xlsx");
	XSSFWorkbook fg=new XSSFWorkbook(excelfiletoread);
	XSSFSheet sheet =fg.getSheetAt(0);
	XSSFRow row;
	XSSFCell cell;
Iterator<Row> rows=sheet.rowIterator();
while(rows.hasNext())
{
	row=(XSSFRow)rows.next();
	Iterator<Cell> cells=row.cellIterator();
	while(cells.hasNext())
	{
		cell=(XSSFCell)cells.next();
		System.out.println(cell.getStringCellValue());
	}
}
	
	
	
}
}
