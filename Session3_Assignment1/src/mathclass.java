import java.lang.Math;
import java.util.Scanner;
public class mathclass {
	
	public static void squareroot(int a)
	{
		double rootvalue;
		rootvalue=Math.sqrt(a);
		System.out.println("Square Root is : " + rootvalue);
	}
	
	public static void cuberoot(int a)
	{
		double cubevalue;
		cubevalue=Math.cbrt(a);
		System.out.println("Cubic Root is : " + cubevalue);
	}
	private static Scanner sc;
	public static void main(String[] args) {
		int a;
		sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		a=sc.nextInt();
		squareroot(a);
		cuberoot(a);

	}

}
