package Generics;

import java.util.ArrayList;

public class Generic1 
{
	public static void main(String args[])
	{
		 ArrayList <String> al= new ArrayList<String>();
		 al.add("Raji");
		 al.add("soni");
		 al.add("Ramana");
		 al.add("jani");
		 al.add("Madhesh");
		 //al.add(10);  if we add integer then it shows error at compile time only not at runtime in generics
		
		 String s=al.get(0);  //no need of type case
		 System.out.println(s);
		 
		 System.out.println("--------------");
		 
		 for(String a:al)
		 {
			 System.out.println(a);
		 }
	}
}
