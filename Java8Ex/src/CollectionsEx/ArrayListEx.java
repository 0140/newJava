package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * http://www.tutorialspoint.com/javaexamples/java_arrays.htm
 * 	
 * @author Bhaskara Sama
 * 
 * ArrayList is part of Collections framework.
 * ArrayList supports dynamic arrays that can grow as needed.
 * 
 * List
  List interface is a ordered collection and it allows duplicate , null elements .
  We can get elements by index in List .  
   Index is added in the same order in which elements are added.
    
   List size is dynamic. But array size is fixed. 
   -----------------------------
   Remove:
   
 * arraylist.remove(index)
 * arraylist.remove(object)
 * -----------------------------
 * If index and object are same, then:
 * create new list with that object.
 * ArrayList newlist = new ArrayList();
 * newlist.add(object);
 * 
 * firstList.removeAll(newlist);
 *---------------------------------------------
 *
 *
 *
 *
 */
public class ArrayListEx {
	
	public  static void  main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("de");
		list.add("fr");

		System.out.println((String) list.get(1));
		
		for(int i=0; i < list.size(); i++)
		{
			
			System.out.println((String) list.get(i));
		}
		
		 for(String s: list)  {
			 System.out.println(s);			 
		 }
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}
	
	
	
	
}
