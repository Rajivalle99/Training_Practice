package Generics;

import java.util.Iterator;

class GenericCls<T>
{
	
	private T obj;

	void add(T obj)
	{
		this.obj=obj;
	}
	T get()
	{
		return obj;
	}
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class GenericClass
{
	public static void main(String args[])
	{
		GenericCls<Integer> ob=new GenericCls<Integer>();
		ob.add(1);
		ob.add(2);
		
//		Iterator<Integer> itr=ob.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		System.out.println(ob.get());
	}
}
