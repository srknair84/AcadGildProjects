import java.util.Scanner;
public class FindPrimeNumber {
	private static Scanner s;
    public static void main(String a[]){
    	int j, x, flag = 0;
        System.out.print("Enter any number :");
        s = new Scanner(System.in);
        x = s.nextInt();
        for( j = 2; j < x; j++)
        {
            if(x % j == 0)
            {
                flag = 0;
                break;
            }
            else
            {
                flag = 1;
            }
         }
         if(flag == 1)
         {
             System.out.println("The "+x+" is a prime number.");
         }
         else
         {
             System.out.println("The "+x+" is not a prime number.");
         }           
    }
}
