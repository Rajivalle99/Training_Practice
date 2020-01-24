package Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generic_HashMap 
{
	

	public static void main(String args[])
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(118,"Raji");
		map.put(119,"Soniya");
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=itr.next();
			System.out.println("Key:"+e.getKey()+" "+"Value:"+e.getValue());
		}
		
		
	}
}
