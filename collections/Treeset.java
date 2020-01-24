package collections;

import java.util.*;
public class Treeset
{

		public static void main(String args[])
		{
			TreeSet<String> hs=new TreeSet<String>();
			hs.add("Raji");
			hs.add("Raji");
			hs.add("soniya");		//It will give o/p in an ASCII Priority Order 
			hs.add("Madesh");
			hs.add("Ramana");
			hs.add("Jani");
			
			
			Iterator itr=hs.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}

	}

