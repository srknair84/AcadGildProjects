import java.util.Scanner;
import java.util.Calendar;

public class DaysinMonth {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int days = 0;
		int year=Calendar.getInstance().get(Calendar.YEAR);
		
		sc=new Scanner(System.in);
		System.out.println("Enter the Month : ");
		int i=sc.nextInt();
		if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
		{
			days=31;
		}
		else if(i==1||i==4||i==6||i==9||i==11)
		{
			days=30;
		}
		else if(i==2){
			if (year%4==0){
				days=29;
			}else
				days=28;
		}
		System.out.print("No of Days is: " + days);
		
}

}
