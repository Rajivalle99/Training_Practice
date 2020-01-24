package collections;

import java.io.*;
import java.util.*;
public class Collectioninreverseorder 
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
			
			Collections.sort(list,Collections.reverseOrder());
			Iterator itr1=list.iterator();
			
			
			while(itr1.hasNext())  //The elements in reverse order
			{
				System.out.println("The elements in reverse order are:"+itr1.next());
			}
			
		}

	}

