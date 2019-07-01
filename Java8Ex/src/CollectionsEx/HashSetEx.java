package CollectionsEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import practice.Vehicle;
import sample.Car;

/**
 * HashSet uses a Set and HashCode mechanism.
 * Like a set, HashSet saves unique elements and it is unordered.
 * 
 * When a element is added to a HashSet,  
 * first hashCode of the element is calculated by JVM
 * This helps decide the address where element is saved in memory
 * 
 * We supply hashCode() method for the value object.
 * Also we write equals method in the Value Object.. 
 * because equals and hashCode methods go together.
 * 
 * 
 * 
 * @author bhaskar
 *
 */
public class HashSetEx {
	public static void main(String args[]){
		HashSet hs3 = new HashSet();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		 hs.add(new Integer(45));
		// Unordered unique group of elements.
		   Set sh = new HashSet(); // Non generic version
		   
		   sh.add(new Car());
		   sh.add(new Vehicle());
		  
		   
			Set<Car>  al3=new HashSet<Car>(); // Generic version // Deals with Parametrized types.
			al3.add(new Car());
			al3.add(new Car());
			//al3.add(new Vehicle());
			
			//al3 = new TreeSet<Car>();
			
		  HashSet<String> set=new HashSet<String>();  
		   //al = new TreeSet();
		  
		  set.add(null);  
		  set.add(null);  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		   
		  // al5.add(new Object());
		  
		  
		  /*Iterator<String> iterator =   al.iterator();
		  while(iterator.hasNext()) {
			String str =  iterator.next();
			System.out.println("Iterator:" + str);
		  }*/
		   
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println("---------------------------------------"); 
		  
		   
		  
		  // For each loop
		   for(String s: set)
		  {
			   System.out.println(s);  

		  } 
		   
		   
		   
		   Set<Car> set2 = new HashSet<Car>();
		    set2.add(new Car());
		    
		    Car c = new Car();
		    c.setVinid("HGHH");
		    set2.add(c);
		    
		 }  
	     
	    
	    
 
	
}
