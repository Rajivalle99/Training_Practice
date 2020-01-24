package collections;
import java.io.*;
import java.util.*;
public class ArrayLists
{
	public static void main(String args[])
	{	
		int n=5;
		ArrayList<String> list=new ArrayList<String>();
		list.add("Raji");
		list.add("Soniya");
		list.add("Ramana");
		list.add("Jani");
		list.add("Madesh");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(list.size());
		
		
		
		
	}

}
