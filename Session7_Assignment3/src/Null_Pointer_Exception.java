class nullpointer{
	
public void printmessage()
	{
		System.out.println("Hello World");
	}
}
public class Null_Pointer_Exception {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		nullpointer np=null;
		try{
			np.printmessage();
		}
		catch(Exception e )
		{
			System.out.print("NullPointerException Occured");
		}
		
	}

}
