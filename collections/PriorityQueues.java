package collections;
import java.io.*;
import java.util.*;
public class PriorityQueues
{
	public static void main(String args[])
	{
		PriorityQueue<String> pr=new PriorityQueue<String>();
		
		Iterator it=pr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		pr.add("queue");
		pr.add("Raji");
		pr.add("Soniya");
		pr.add("Jani");
		pr.add("Madhesh");
		pr.add("arjun");
		pr.add("STack");
		pr.add("Raji");
		Iterator itr=pr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---------------------");
//		pr.peek(); //
//		pr.poll(); //removes top element of the q
		//pr.element();
//		System.out.println(pr.peek());   //if q is empty then it returns null..
//		System.out.println(pr.element()); // if q is empty then it returns exception..
//		System.out.println(pr.poll());
//		Iterator itr1=pr.iterator();
//		while(itr1.hasNext())
//		{
//			System.out.println(itr1.next());
//		}
	}

}
