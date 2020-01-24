package collections;
import java.util.*;
public class LinkedLists 
{
	public static void main(String args[])
	{
		LinkedList<Integer> llist= new LinkedList<Integer>();
		for(int i=1;i<=5;i++)
		{
			llist.add(i);
		}
	//	llist.remove();
		Iterator itr=llist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Iterator itr1=llist.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
