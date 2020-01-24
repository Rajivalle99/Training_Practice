package ComparatorAss;

import java.io.*;
import java.util.*;

import ComparableAss.Student;
public class AgeComparatorEx implements Comparator<AgeComparatorEx> 
{
	 int rollno;
	 String name;
	 int age;

	AgeComparatorEx(int rollno,String name,int age) 
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	
	}
	
	public AgeComparatorEx() {
		
	}

	@Override
	public int compare(AgeComparatorEx stu1, AgeComparatorEx stu2) 
	{
		if(stu1.age==stu2.age)		//Here we are comparing the age by comparing each students age
			return 0;
		if(stu1.age>stu2.age)
			return 1;
		return -1;
		
		
	}
	
	public int compare1(AgeComparatorEx stu1, AgeComparatorEx stu2)
	{
		return stu1.name.compareTo(stu2.name); //By name
		
	}
	
	public static void main(String args[])
	{

		ArrayList<AgeComparatorEx> list=new ArrayList<AgeComparatorEx>();
		list.add(new AgeComparatorEx(118,"Raji",21));
		list.add(new AgeComparatorEx(120,"Soniya",22));
		list.add(new AgeComparatorEx(121,"Madhesh",22));
		list.add(new AgeComparatorEx(121,"Ramana",22));
		list.add(new AgeComparatorEx(122,"jani",21));
		list.add(new AgeComparatorEx(123,"Arjun",2));
		
		//We are comparing elements by type.here like name and age
		
		// Comparing this by age
		Collections.sort(list,new AgeComparatorEx());
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			AgeComparatorEx st=(AgeComparatorEx)itr.next();
				
			System.out.println(st.rollno+ " "+st.name+" "+st.age);
		}
		
	
//		while(itr1.hasNext())
//		{	
//			ComparatorEx st=(ComparatorEx)itr1.next();
//			System.out.println(st.rollno+ " "+ st.name+ " "+st.age);
//			
//		}
			
			
		
	}
}
