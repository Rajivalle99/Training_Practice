package Threads;

public class TogetCurrentThread extends Thread
{
	public void run()
	{
		System.out.println("Current thread is here:"+Thread.currentThread().getName());
	}

	public static void main(String args[])
	{
		TogetCurrentThread t1=new TogetCurrentThread();
		TogetCurrentThread t2=new TogetCurrentThread();
		t1.start();
		t2.start();
		
	}
}
