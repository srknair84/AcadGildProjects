
public class primenumber {

	public static void main(String[] args) {
		int i,j;
		boolean prime=true;
		for (i=1;i<=100;i++)
		{
			 prime=true;
			for(j=2;j<i;j++){
				if (j%i==0) {
					prime=false;
				}
			}
			if (prime==true);{
				System.out.println(i + "");
			}
		}
		
	}
}

