
public class Threading_Priority extends Thread {
	public void run()
	{
		System.out.println("Running Thread is: " + Thread.currentThread().getName() );
		System.out.println("Running Priority is: " + Thread.currentThread().getPriority() );
	}

	public static void main(String[] args) {
		Threading_Priority A=new Threading_Priority();
		Threading_Priority B=new Threading_Priority();
		Threading_Priority C=new Threading_Priority();
		
		A.setPriority(MIN_PRIORITY);
		B.setPriority(NORM_PRIORITY);
		C.setPriority(MAX_PRIORITY);
		
		A.start();
		B.start();
		C.start();
	}

}
