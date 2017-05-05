
public class String_Index_OutofBoune_Exception {

	public static void main(String[] args) {
		try
		{
			String str="HELLO";
			System.out.println(str.length());
			char c =str.charAt(0);
			c=str.charAt(10);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String IndexOutOfBounds Exception Occured");
		}
	}

}
