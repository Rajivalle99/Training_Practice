package Threads;

public class Sleepmethod extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Sleepmethod t1=new Sleepmethod();
		Sleepmethod t2=new Sleepmethod();
		t1.start();
		t2.start();	
		
		System.out.println("--------------------");
		
		t1.run();   
		t2.run();
		
	}
}
