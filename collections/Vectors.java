package collections;
import java.io.*;
import java.util.*;
public class Vectors
{
		public static void main(String args[])
		{	
			int n=5;
			Vector<String> list=new Vector<String>();
			list.add("Raji");
			list.add("Soniya");
			list.add("Ramana");
			list.add("Jani");
			list.add("Madesh");
			list.add("Raji");
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println(list.size());
			
			
			
			
		}

}
