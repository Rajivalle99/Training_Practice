package Generics;

public class Genericmethod 
{
	public static<E> void printArray(E[] elements)
	{
		for(E element:elements)
			System.out.println(element);
		System.out.println();
	}
	public static void main(String args[])
	{
		   Integer[] intArray1={1,2,3,4,5,6};
	        Character[] charArray={'R','A','J','I','&','S','O','N','I','A'};
	        System.out.println("Printing Integer Array");
	        printArray(intArray1);
	        
	       System.out.println( "Printing Character Array" );  
	      
			printArray( charArray );         
	}
	
}
