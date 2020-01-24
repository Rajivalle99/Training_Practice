package collections;
import java.util.*;
public class arraydeq 
{
	public static void main(String args[])
	{
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.add("Raji");
		ad.add("Soniya");
		ad.add("123");
		ArrayDeque<Integer> ad1=new ArrayDeque<Integer>();
		ad1.add(1);
		ad1.add(2);
		ad1.add(3);
		
		Iterator itr=ad.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------------------");
		
		Iterator itr1=ad1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
