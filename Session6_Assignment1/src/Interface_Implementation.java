import java.util.Scanner;

interface numbers
{
	public void printnumber(int num);
	public void printSqare(int num);
}

class Interface_Implementation implements numbers {
	
	
	
	public void printnumber(int num) {
		//int num=5;
		System.out.println("Entered Number is : " +num);
		
	}

	public void printSqare(int num) {
		int sqr=5*5;
		System.out.println("Square of Entered Number is : " +sqr);
		
	}
	private static Scanner sc;
	public static void main(String[] args) {
		int num;
		sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		num=sc.nextInt();
		numbers obj=new Interface_Implementation();
		obj.printnumber(num);
		obj.printSqare(num);
	}

	}
