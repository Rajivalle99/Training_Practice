package collections;

import java.util.*;
import java.io.*;
public class CollectionSort
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(3);
		
		Collections.sort(list);
		Iterator itr=list.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println("The elements are:"+itr.next());
		}
		
	}

}
