package Threads;

public class DeamonThread extends Thread
{	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Deamon Thread");  //Provide Services to the threads.And it is terminated when all the threads are die.
		}
		else
		{
			System.out.println("Normal Thread");
		}
	}

	public static void main(String args[])
	{
		DeamonThread t1=new DeamonThread();
		DeamonThread t2=new DeamonThread();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
	}

}
