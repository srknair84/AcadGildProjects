import java.util.Scanner;
public class String_Reverse {
	//static String reverse_string;
	public static void reverse(String input){
		
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	        
	    }
	    //reverse_string=new String(in);
	    System.out.print("Reverse String is :" + new String(in));
	    //return new String(in);
	    
	}
	private static Scanner sc;
	public static void main(String[] args) {
		String reverse;
		
		sc=new Scanner(System.in);
		System.out.print("Enter your String : ");
		reverse=sc.next();
		reverse(reverse);
		//System.out.print("Reverse String is :" + sr.reverse_string);
	}

}
