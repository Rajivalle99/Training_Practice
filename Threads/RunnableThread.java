package Threads;

public class RunnableThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is created");
		
	}
	public static void main(String args[])
	{
		RunnableThread t1=new RunnableThread();
		Thread t2=new Thread(t1);
		t2.start();
		
	}
	
}
