import java.util.Scanner;
public class Calculator {
	public static void addition(double a,double b)
	{
		double addnumber;
		addnumber=(a+b);
		System.out.println("Addition of Two Number is : " + addnumber);
	}
	public static void subraction(double a,double b)
	{
		double subnumber;
		subnumber=(a-b);
		System.out.println("Subtraction of Two Number is : " + subnumber);
	}
	public static void multiplication(double a,double b)
	{
		double multiplynumber;
		multiplynumber=(a*b);
		System.out.println("Multiplication of Two Number is : " + multiplynumber);
	}
	public static void division(double a,double b)
	{
		double dividenumber;
		dividenumber=(a/b);
		System.out.println("Division of Two Number is : " + dividenumber);
	}
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		String operation;
		
		sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		a=sc.nextDouble();
		//Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Second Number :");
		b=sc.nextDouble();
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter Operator :");
		operation=sc3.next();
		sc3.close();
		
		if (operation.equals("+"))
		{
			//System.out.println("Addition of Two Number is : " +(a+b));
			addition(a,b);
		}
		if (operation.equals("-"))
		{
			 subraction(a,b);
		}
		if (operation.equals("/"))
		{
			 division(a,b);
		}
		if (operation.equals("*"))
		{
			 multiplication(a,b);
		}
		
	}
}
