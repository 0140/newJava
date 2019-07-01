package CollectionsEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * http://stackoverflow.com/questions/203984/how-do-i-remove-repeated-elements-from-arraylist
 * 
 * @author Bhaskara Sama
 *
 */
public class EliminateDuplicatesList {

	public static void main(String args[])
	{
		
		List<String> al = new ArrayList<String>();
		// add elements to al, including duplicates
		Set<String> hs = new HashSet<String>( );
		hs.addAll(al); // duplicates eliminated
		al.clear();
		al.addAll(hs);
		//----------------------------------------
		
		ArrayList l1 = new ArrayList();
		ArrayList l2 = new ArrayList(); // result
		
		//hs = new HashSet();

		Iterator iterator = l1.iterator();

		        while (iterator.hasNext())
		        {
		            String currentElement = (String) iterator.next();
		            if(!l2.contains(currentElement)) l2.add(currentElement);
		        }
		        
		      //----------------------------------------
				
		/*List s = new ArrayList();
		Set result = new HashSet;
		Map s = 
		
		for (int i=0; i< s.size(); i++)
		{
			
			String current = (String) s.get(i);
			    
			  for(int p=0; p< s.size(); p++)
			  {
				  String loopElemnt = (String) s.get(p);
				  if (current.equals(loopElemnt))
				  {
					  //Do not sdd into set
				  }
			  }
			
			  
		}*/
		
		
		
		
	}
}
