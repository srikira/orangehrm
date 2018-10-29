package gangapackage;

import java.util.ArrayList;

public class arraylistexample 
{
	public static void main(String[]args)
	{
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("qap1");
		AL.add("qap1");
		AL.add("qap2");
	System.out.println(AL.get(0));
	System.out.println(AL.get(1));
	System.out.println(AL.get(2));
	// to get array length
	System.out.println(AL.size());
	AL.add("qap3");
	AL.add("qap4");
	AL.add("qap5");
	System.out.println(AL.get(0));
	System.out.println(AL.get(1));
	System.out.println(AL.get(2));
	System.out.println(AL.get(3));
	System.out.println(AL.get(4));
	System.out.println(AL.get(5));
// to get array length
	System.out.println(AL.size());

		
	}

}
