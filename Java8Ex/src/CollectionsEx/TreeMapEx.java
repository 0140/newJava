package CollectionsEx;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import CollectionsEx.compaatorEx.PriceComparator;
import sample.Address;
import sample.bean.Customer;

/**
 * TreeMap sorts elements based on key.
 * TreeMap deals with key and value pairs. Collection of key, value pairs.
 * 
 * TreeMap is ordered. Meaning, TreeMap sorts elements based on the Key.
 * We know Key should be unique.
 * The key can be naturally sortable to sort the kay value pairs based on key.
 * 
 *   HashMap is unordered but TreeMap is ordered, meaning, TreeMap sorts on key.
 * 
 * If Key is not sortable, meaning key objects are not implementing Comparable interface,
 *    Then we need to supply a Comparator.
 * 
 * 
 * 
 * 
 * @author bhaskar
 *
 */
public class TreeMapEx {
	public static void main(String args[]){  
		   // sorting of values based on Keys.
		// Key implements Comparable interface.
		
		  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		  // HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(400, "John");
		  hm.put(101,"Vijay");  
		  hm.put(101,"Ram");
		  hm.put(103,"Rahul");   
		  hm.put(105, null); 
		  //hm.put(null, "David");  

		  
		  // Collections.sort(new ArrayList<CitySimple>(), new GradeComparator());
		   
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		  TreeMap<Address, Customer> customers = new TreeMap<Address, Customer>(new AddressComparator());
		  
		  // TreeMap is For sorting the objects based on Key.
		       //Key implements Comparable interface.
		  // HashMap is unordered.
		  
		  /**
		   * 
		   * Map saves key, value pairs.
		   *    keys is like index. 
		   *    
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * 
		   * Map
		   */
		  
		 }  
	
	   
}
