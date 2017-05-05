
public class Patterns {
	public static void main(String [] args){
		int i,j,a,b;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();;
		}
		for(a=5;a>1;a--)
		{
			for(b=1;b<a;b++)
			{
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
