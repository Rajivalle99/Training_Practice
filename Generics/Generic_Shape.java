package Generics;

import java.util.*;  
abstract class Generic_Shape
{  
	abstract void draw();  
}  
	class Rectangle extends Generic_Shape
	{  
		void draw(){System.out.println("drawing rectangle");}  
	}  
	class Circle extends Generic_Shape	
	{  
		void draw(){System.out.println("drawing circle");}  
	}  
	class GenericTest{  
	//creating a method that accepts only child class of Shape  
	public static void drawShapes(List<? extends Generic_Shape> lists)
	{  
		for(Generic_Shape s:lists)
		{  
			s.draw();//calling method of Shape class by child class instance  
		}  
	}  
	public static void main(String args[])
	{  
		List<Rectangle> list1=new ArrayList<Rectangle>();  
		list1.add(new Rectangle());  
  
		List<Circle> list2=new ArrayList<Circle>();  
		list2.add(new Circle());  
		list2.add(new Circle());  
  
		drawShapes(list1);  
		drawShapes(list2);  
	}
}  