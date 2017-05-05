import java.util.*;
public class Iterator_Using_While {

	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Ramesh");
		arraylist.add("SAM");
		arraylist.add("Prakash");
	
		Iterator<String> itr=arraylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}


