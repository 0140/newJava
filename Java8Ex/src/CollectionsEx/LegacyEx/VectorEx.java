package CollectionsEx.LegacyEx;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector is legacy class.
 * ArrayList is part of Collections framework introduced in JDK 1.2
 * 
 * Vector is Synchronized. ArrayList is not. So ArrayList is faster.
 * 
 * ArrayList used Iterator.  Vector uses Enumeration and Iterator.
 * 
 * 
 * @author bhaskar
 *
 */
public class VectorEx {
	public static void main(String args[]){      
		  Vector  v=new Vector ();//creating vector  
		  
		  
		  v.add("umesh");//method of Collection  
		  v.addElement("irfan");//method of Vector  
		  v.addElement("kumar");  
		  //v.addElement(null);  

		  
		  //v.get(0)
		  
		  //traversing elements using Enumeration  
		  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  }  
		  
		  for(int i=0; i < v.size(); i++)
		  {
			  String s=(String) v.get(i);
			  System.out.println(s);
		  }
		  
		 }      
}
