package ComparableAss;
import java.util.*;


public class Student implements Comparable<Student> //Comparable<Student> inbuilt method
{
	int age;
	String name;
	int rollno;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Student stu) //This method is automatically generated by implemented class
	{
		if(age==stu.age)    
			return 0;
		if(age>stu.age)
			return 1;
		return -1;
	}
	
	public static void main(String args[])
	{
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(118,"Raji",21));
		list.add(new Student(120,"Soniya",22));
		list.add(new Student(121,"Madhesh",22));
		list.add(new Student(121,"Ramana",22));
		list.add(new Student(122,"jani",21));
		list.add(new Student(123,"Arjun",2));
		
		
		
		Collections.sort(list);
		
//		 Iterator itr=list.iterator();
//		
//			while(itr.hasNext())
//			{
//				System.out.println(itr.next());
//			}
//		
	
		for(Student stu:list)
		{  
			System.out.println(stu.rollno+" "+stu.name+" "+stu.age);  
		}  
		
	
	}
	
	
}
