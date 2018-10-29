package gangapackage;

import java.util.ArrayList;

public class arraylistmyexample 
{
	public static void main(String[]args)
	{
		ArrayList<Object> X=new ArrayList<Object>();
		X.add("g2");
		X.add("g3");
        X.add("g4");
        System.out.println(X.get(0));
        System.out.println(X.get(1));
        System.out.println(X.get(2));
        // to get array length
        System.out.println(X.size());
        X.add("h2");
        X.add("h4");
        X.add("h5");
        X.add("h6");
        System.out.println(X.get(3));
        System.out.println(X.get(4));
        System.out.println(X.get(5));
        System.out.println(X.get(6));
// to get array length
System.out.println(X.size());

	}

}
