package CollectionsEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

 

import sample.bean.Address;
import sample.bean.Customer;

/**
 * http://www.tutorialspoint.com/java/java_collections.htm
 * 
 * http://data-structure-learning.blogspot.in/2015/06/difference-between-set-list-and-map.html
 * http://www.java4s.com/core-java/difference-between-java-set-list-and-map-collections/
 * http://java67.blogspot.in/2013/01/difference-between-set-list-and-map-in-java.html
 * 
 * http://stackoverflow.com/questions/4553624/hashmap-get-put-complexity
 * http://javarevisited.blogspot.in/2015/01/top-20-string-coding-interview-question-programming-interview.html
 * 
 * Between Enumeration and Iterator, Enumeration is older and its there from JDK1.0 while iterator was introduced later. Iterator can be used with Java arraylist, java hashmap keyset and with any other collection classes. 


Another similarity between Iterator and Enumeration in Java is that functionality
 of Enumeration interface is duplicated by the Iterator interface. 

Only major difference between Enumeration and iterator is Iterator has a remove() method
 while Enumeration doesn't. Enumeration acts as Read-only interface, 
 because it has the methods only to traverse and fetch the objects, 
 where as by using Iterator we can manipulate the objects like adding and removing the
  objects from collection e.g. Arraylist. 

Also Iterator is more secure and safe as compared to Enumeration because it does not 
allow other thread to modify the collection object while some thread 
is iterating over it and throws ConcurrentModificationException. 
This is by far most important fact for me for deciding between Iterator vs Enumeration 
in Java. 

In Summary both Enumeration and Iterator will give successive elements,
 but Iterator is new and improved version where method names are shorter, and 
 has new method called remove. 
 * 
 * @author Bhaskara Sama
 *
 */
public class HashMapEx {

	public static void main(String args[]){  
		   
		Map<String, Object> map =null;
		  //HashMap<Integer,String>  hm23=new HashMap<Integer,String>();  
		  

		    /*HashMap h = new HashMap();
		   Map hmraw = new HashMap();
		   
		  Map<Integer,String> map=new HashMap<Integer,String>();*/
 
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
 
		  hm.put(100,"Amit");  // Double, Boolean, Float, Character // Autoboxing
		  hm.put(101,"Vijay");  //  Boxing
		  hm.put(102,"Rahul");  
		  hm.put(100,"David");  
		  hm.put(103,"Amit");  // Double, Boolean, Float, Character


		  
		  hm.put(null, null);  
		  //hm.put(null, "Val");  
		  
		  String v3 = hm.get(100);  
		  
		  
		  // First way
		  Set<Integer> keySet = hm.keySet(); // map.heySet
		  
		  // looping..
		  for(Integer itgr: keySet) { // for a variable
			  String v4 = hm.get(itgr);
			  System.out.println(itgr + ":" + v4);
		  }
		  
		  // Second way
		  Collection<String> valColl = hm.values();
		  for(String s: valColl) {
			  System.out.println("HashMap value:" +   s);

		  }
		  
		  
		  // http://stackoverflow.com/questions/4553624/hashmap-get-put-complexity
		  // HashMap time complexity
		  
		  String s = hm.get(100); 
		  
		  // Third way to loop
		  for(Map.Entry<Integer,String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		 /* Set keys = hm.keySet();
		  Set val = hm.values()*/
		  
		  System.out.println("------------------------");
		  
		  Iterator<Map.Entry<Integer, String>>  it = hm.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry<Integer, String> pair = it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		    
		    if (hm.containsKey(100)) {}
		    if (hm.containsValue("Rahul") ) {}
		    
		    Address a1 = null;
		    Address a2 = null;
		    
		    //Map<Car, Customer>
		    Map<Address,Customer> hm2=new HashMap<Address,Customer>(); 
		    
		    //hm2.put(new Address(), new Customer());	    
		    
		    Address addr = new Address();
		    Customer customer = new Customer();
		    hm2.put(addr, customer);

		    
		    Address addr2 = new Address();
		    Customer cus = hm2.get(addr2);
		    
		    if ( cus == null) System.out.println("");
/*		    Set s2 = null;
		    R
		    List l =  new ArrayList();
		    
		    l.clear();
		    
		    l.addAll(s2);
*/		    
		    
		  TreeMap t = new TreeMap();
		  //t.put(null, " ");
		  
		  java.util.Vector v = new java.util.Vector();
		  v.add(null);
		  
		  
		  double d =34.5;
		  Double dobj = new Double(d);
		  Double d3 = 45.9; // Auto boxing
		  
		  d = d3; // Auto Unboxing
		 }  
}
