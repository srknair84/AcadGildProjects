import java.util.HashSet;
import java.util.Iterator;
public class HashSet_Iterator {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("Ramesh");
		hset.add("Divya");
		hset.add("Adwaith");
		hset.add("Akshara");
		
		Iterator<String> itr=hset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
