class count implements Runnable
{
	Thread mythread;
	count()
	{
		mythread=new Thread(this,"My Runnable Thread");
		System.out.println("My Thread Created" + mythread);
		mythread.start();
	}	
	public void run()
	{
		
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Printing the count" + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("My Thread Intrrupted");
		}
		System.out.println("Mythread Run is Over");
	}
}
public class Print_Count_Thread {

	public static void main(String[] args) {
		count cnt=new count();
		try
		{
			while(cnt.mythread.isAlive())
			{
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Maint thread Interrupted");
		}
		System.out.println("Main Thread run is Over");
	}

}
