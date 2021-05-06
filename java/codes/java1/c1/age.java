package java1;

import java.util.*;

public class age{
	
	static Scanner input = new Scanner(System.in).useLocale(Locale.US);
	
	public static void main(String[] agrs)
	{
		ArrayList<first_calss> myarray = new ArrayList<first_calss>();
		
		myarray.add(new first_calss("ALi", "Basheer"));
		myarray.add(new first_calss("Saja", "Basheer"));
		myarray.add(new first_calss("Adel", "Basheer"));
		
		for(int i = 0; i < myarray.size(); i++)
		{
			System.out.println(myarray.get(i).gitifo());
		}
	}
}