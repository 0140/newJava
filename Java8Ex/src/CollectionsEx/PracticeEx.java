package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeEx {

	public static void main(String[] args) {
		List<Integer>  al = new ArrayList<Integer>();
		
		// Why should we use parameterized types with collections?
		
		al.add(2);
		al.add(3);
		
		Integer s = (Integer) al.get(1);
		
		for(Integer n: al)
		{
			
			System.out.println(n);
		}
		
		for(int i =0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("___________________");
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			Integer str = itr.next();
			System.out.println(str);
		}
		
		System.out.println("___________________");

		al.forEach(i -> System.out.println(i)); //Java 8 // for each // Lambda
		
		System.out.println("$$$$$$$$$$$$$");

		al.forEach(i -> {System.out.println(i);
						 if (i % 2 == 0) System.out.println(i + " even number");
			
						}		
				);
		

	}

}
