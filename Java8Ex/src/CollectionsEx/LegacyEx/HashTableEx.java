package CollectionsEx.LegacyEx;

import java.util.Enumeration;
/**
 * http://www.tutorialspoint.com/java/java_collections.htm
 * 
 */
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * https://www.quora.com/What-is-fail-fast-and-fail-safe-in-java-collection-framework
 * @author bhaskar
 *
 */
public class HashTableEx {
	public static void main(String args[]){  
		   
		  Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		  
		  ht.put(100,"Amit");  
		  ht.put(102,"Ravi");  
		  ht.put(101,"Vijay");  
		  ht.put(103,"Rahul");  // No nulls
		  				// Enumeration to loop over contents of legacy
		  				// Collections framework -- failfast (
		  				//		When one thread modifies a collection, if 
		  				//		other thread is trying to access the collection, it will get
		  				//		ConcurrentModificationException)_
		  
		  			 
		  
		  System.out.println(ht.get(100));
		  
		  for(Map.Entry m:ht.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		   Set<Integer> keySet = ht.keySet();
		   
		   Enumeration<Integer> enumeration = ht.keys();
		   
		   while(enumeration.hasMoreElements()) {
			   Integer key = enumeration.nextElement();
			   System.out.println("Value of "+key+" is: "+ht.get(key));
			   
		   }
		   
		  
		 }  
	
	

}
