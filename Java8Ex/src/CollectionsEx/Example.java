package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sample.City;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List  list = new ArrayList(); // Non Generic // raw type
		
		list.add("1");
		list.add("2");
		
		/*City c = new City();
		
		list.add(c);
		*/
		
		list.get(1);
		
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		String s = (String) list.get(1); // During Runtime
		
		List<String> stringcollection = new   ArrayList<String>(); // Generic versioin
		//stringcollection.add(c); // During compilation
		
		String s2 = stringcollection.get(1);
		
	 
		for(String s4: stringcollection) {
			System.out.println(s4);

		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			itr.next();
			
			
		}
		

	}

}
