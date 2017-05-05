import java.util.Scanner;
public class Sorting_Inserting_Array {
	public static Scanner sc;
	public static void sortingnumbers()
	{
		int i,j,n,temp;
		int arr[]=new int[50];
		sc=new Scanner(System.in);
		System.out.print("Enter Total Number of Elements:");
			n=sc.nextInt();
			System.out.print("Enter " +n +" Numbers :");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(i=0;i<n;i++);
			{
				for(j=i+1;j<n;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			
			System.out.println("Sorted List are : \n");
			for(i=0;i<n;i++)
			{
				System.out.print(arr[i] + " ");
				
			}
			System.out.print(arr[n-1]);
		}
	
		
	public static void insertion()
	{
		int i,n,insert,pos;
		int arr[]=new int[50];
		sc=new Scanner(System.in);	
			System.out.print("Enter Array Szie:");
			n=sc.nextInt();
			System.out.print("Enter " +n +" Elements :");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print("Enter Element to be Inserted :");
			insert=sc.nextInt();
			System.out.print("Enter Index Number to be Inserted :");
			pos=sc.nextInt();
			
			for(i=n;i>pos;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[pos]=insert;
			System.out.println("New Array is : \n");
			for(i=0;i<n+1;i++)
			{
				System.out.print(arr[i] + " ");
			}
	}
	public static void main(String[] args) {
		int options;
		sc=new Scanner(System.in);
		System.out.println("Enter 1 to Sort Arrays and 2 to Insert Array");
		options=sc.nextInt();
		if (options==1)
		{
			sortingnumbers();
		}
		if (options==2)
		{
			insertion();
		}
	}
}
