import java.util.Scanner;
public class VoteEligiblity {

	private static Scanner sc;

	public static void main(String[] args) {
		int a;
		sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		a=sc.nextInt();
		if (a>=18){
			System.out.println("You are Eligible to Vote");
		}else{
			System.out.println("You are Not Eligible to Vote");
		}
				
	}

}
