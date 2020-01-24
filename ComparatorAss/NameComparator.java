//Program for name Comparision by using comparator

package ComparatorAss;
import java.util.*;

public class NameComparator implements Comparator<NameComparator> 
{
	 int rollno;
	 String name;
	 int age;

	NameComparator(int rollno,String name,int age) 
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	
	}
	
	public NameComparator() {}

	@Override
	public int compare(NameComparator o1,NameComparator o2)
	{	
		return o1.name.compareTo(o2.name);	
	}
	public static void main(String args[])
	{
		ArrayList<NameComparator> list=new ArrayList<NameComparator>();
		list.add(new NameComparator(118,"Raji",21));
		list.add(new NameComparator(120,"Soniya",22));
		list.add(new NameComparator(121,"Madhesh",22));
		list.add(new NameComparator(121,"Ramana",22));
		list.add(new NameComparator(122,"Jani",21));
		list.add(new NameComparator(123,"Arjun",2));
		

		System.out.println("This by name:--------------");
		
		Collections.sort(list,new NameComparator());
		for(NameComparator st:list)
		{
			System.out.println(st.rollno+ " "+ st.name+ " "+st.age);
		}
		
//		while(itr1.hasNext())
//		{	
//			ComparatorEx st=(ComparatorEx)itr1.next();
//			System.out.println(st.rollno+ " "+ st.name+ " "+st.age);
//			
//		}		
	}
}
