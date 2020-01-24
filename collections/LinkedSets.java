package collections;
import java.util.*;
public class LinkedSets
{

	public static void main(String args[])
	{
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("Raji");
		hs.add("Raji");
		hs.add("soniya");		// It will give o/p in an insertion order
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
