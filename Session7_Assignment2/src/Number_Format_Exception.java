public class Number_Format_Exception 
{
	public static void main(String[] args) 
	{
		try{
			
			int num=Integer.parseInt("XYZ");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			//if entered value is string then following message will be displayed
			System.out.println("NumberFormatException Occured");
		}
	}

}
