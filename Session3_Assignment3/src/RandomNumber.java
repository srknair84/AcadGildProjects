import java.util.Scanner;
public class RandomNumber {
	private static Scanner sc;
	public static void main(String[] args) {
		int N; 
		sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		N=sc.nextInt();
		double randomNumber =  Math.random();
        int randomInt = (int)(N * randomNumber);
 
        //Displays the random number
        System.out.println(randomInt);
 

	}

}
