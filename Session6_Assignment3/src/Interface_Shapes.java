import java.util.Scanner;

interface numbers
{
	public void Rectangle(double length,double breath);
	public void Triangle(double length,double breath);
	public void Circle(double radius);
	public void Square(double length,double breath);
	
}

class Interface_Shapes implements numbers
{
	public void Rectangle(double length,double breath) 
	{
		double rectarea;
		rectarea=length*breath;
		System.out.println("Entered Number is : " +rectarea);
	}

	public void Square(double length,double breath) {
		double sqr=length*breath;
		System.out.println("Square of Entered Number is : " +sqr);
	}
	public void Triangle(double length, double breath) {
				
	}

	public void Circle(double radius) {
				
	}
	private static Scanner sc;
	public static void main(String[] args) {
		double length,breath;
		sc=new Scanner(System.in);
		System.out.print("Enter the Length: ");
		length=sc.nextInt();
		System.out.print("Enter the Breath: ");
		breath=sc.nextInt();
		numbers obj=new Interface_Shapes();
		obj.Square(length,breath);
		obj.Rectangle(length,breath);
	}
}
