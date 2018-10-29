package gangapackage;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorexample 
{
	public static void main(String[]args)
	{
		ArrayList<Integer> AL=new ArrayList<Integer>();
		AL.add(67);
		AL.add(34);
		AL.add(45);
		AL.add(37);
		AL.add(38);
		// create iterator object for array list
		Iterator<Integer> IT=AL.iterator();
		while(IT.hasNext())
		{
			int x=IT.next();
			System.out.println(x);
		//create iterator object for array list using for loop
		/*	for(Integer y:AL)
			{
				System.out.println(y);
			}
*/

		
	}

}
}