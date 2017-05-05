
public class Array_Exception_Handling {

	public static void main(String[] args) {
		char[] hello=new char[]{'H','E','L','L','O'};
		System.out.println(hello);
		try
		{
			for(int i=0;i<=hello.length;i++)
			{
				System.out.println(hello[i]);
			}
		}
		catch(Exception e)
		{
			System.out.print("Array out of Range");
		}
	}

}
