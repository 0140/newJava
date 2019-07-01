package CollectionsEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

 
/**
 * TreeSet is oredered group of unique elements.
 *   HashSet is unordered. But TreeSet orders the elements in ascending order.
 *   
 * The elemens may be naturallly orderable.
 * Numbers and String objects are ordered in lexicographic order because 
 *       they are naturally orderable.
 *       
 * In generaal Java Objects become orderable if they implement Comparable interface.
 * Comparable interface has compareTo method using which the order of elements is decided.
 * compareTo returns a negative integer, zero, or a positive integer as this object
     is less than, equal to, or greater than the specified object.
 *  public int compareTo(T o);
 *  
 * If the Objects are not implementing Comparable interface, 
 * then We write Comparators, that is the java classes that implement Comparator interface.
 * We supply Comparator to TreeSet in the constructor so that
 * TreeSet orders the elements as per return value of compare method.
 * 
 * Cpmparator has method:
 * public int compare(Student s1, Student s2) {
	
 *
 * 
 * 
 * @author bhaskar
 *
 */
public class TreeSetNotes {

	 public static void main(String args[]){  
		 
		 /**
		  *  How does it sort?
		  *  Natural order -- dictionary -- ascending
		  *  
		  *  
		  *  
		  */
		 Set<String> s = new HashSet<String>();
		  s.add(null);
		  // -- dictionary order, lexicographic order
		  TreeSet<String> ts=new TreeSet<String>();  // sorted in ascending order  -- ascending
		  ts.add("Ravi");  
		  ts.add("Vijay");  
		  ts.add("Ravi");  
		  ts.add("Ajay");  
		  // ts.add(null);
		  
		  Iterator<String> itr=ts.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  //new TreeSet(comparator)
		  
}
}