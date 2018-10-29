package frameworkLIB;

import org.testng.annotations.Test;

public class businessfunstionsex2 
{
@Test
public void openapp()
{
	businessfunctionsex br=new businessfunctionsex();
	br.configdriver("firefox");
	br.openapp("http://apps.qaplanet.in/qahrm");
	br.logintoorangehrm("qaplanet1", "lab1");
	br.addemployee();
	br.logoutfromapp();
	//br.closebrowser();                           
	//br.quitobject();
}

}
