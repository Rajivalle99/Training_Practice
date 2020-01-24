package Threads;

public class ExtendThread extends Thread 
{
	public void run()
	{
		System.out.println("Basic thread");
	}
	
	public static void main(String args[])
	{
		ExtendThread t=new ExtendThread();
		t.start();
		
	}
}
