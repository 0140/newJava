package CollectionsEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.centillion.Car;
import com.centillion.Vehicle;

public class DummyEx {

	public static void main(String[] args) {
		
		//Set x = new  Set();
		
		HashSet<String> setr = new HashSet<String>();
		setr.add("Ram");
		setr.add("Dave");
		setr.add("John");
		setr.add("Dave");
		setr.add("Sally");
	/*	Car c = new Car("jack", 232, "323");
		setr.add(new Car("jack", 232, "323"));
		setr.add(c);*/
		
		setr.add(null);
		
		// enhanced
		for(String s: setr) {			
			System.out.println(s);
		}
		 
		ArrayList al = new ArrayList();
		al.add(new Car());
		al.add("Hello");
		
		ArrayList<Car> al2 = new ArrayList<Car>();
		al2.add(new Car());
		//al2.add("Hello");
		
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("One");
		al3.add("Hello");
		al3.add("One");
		
		String s = al3.get(1);
		System.out.println(s);
		
		String s2 = al3.get(2);
		System.out.println(s2);
		System.out.println(al3.get(0));
		
		for(int i=0; i < al3.size(); i++ ) {
			System.out.println(al3.get(i));
		}
		
		Set<String> set = new HashSet<String>();
		set.addAll(al3);
		
		al3.clear();
		al3.addAll(set);
		
		System.out.println("---------------------");

		for(String s6: al3) {			
			System.out.println(s6);
		}
		
		int[] arr = new int[3];
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5); // auto boxing
		a.add(new Integer(10));
		
		int x = a.get(1); // auto unboxing
		
		a.addAll(al);
		System.out.println("++++++++++++++++++++++++");

		Iterator<String> itr = al3.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<ArrayList<String>> al5 = null;

	}

}
