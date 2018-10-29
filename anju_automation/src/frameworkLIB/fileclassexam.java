package frameworkLIB;

import java.io.File;

public class fileclassexam 
{
public static void main(String[]args) throws Exception
{
	                 File x=new File("E:\\Grid");  
	                 if(!(x.exists()))
	                 {
	                	 x.createNewFile();
	                 }
	                 if(x.exists())
	                 {
	                	 System.out.println("file exists");
	                 }
// to get absolute path
	                 System.out.println(x.getAbsolutePath());
	                 x.delete();
}
}
