package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolC implements Runnable
{
	private String message;
	public ThreadPoolC(String s)
	{
		this.message=s;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"(Start)message"+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
	private void processmessage()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class ThreadPoolClass
{
	public static void main(String args[])
	{
		ExecutorService executor=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++)
		{
			Runnable worker=new ThreadPoolC(""+i);
			executor.execute(worker); //calling executor method of executor service
		}
		executor.shutdown();
		while(!executor.isTerminated())
		{
			System.out.println("All the threads are finished");
			
		}
	} 
}