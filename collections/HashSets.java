package collections;
import java.util.*;
public class HashSets
{
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Raji");
		hs.add("Raji");
		hs.add("soniya");		
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
