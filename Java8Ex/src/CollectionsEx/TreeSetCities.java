package CollectionsEx;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet is a set of elements that are ordered.
 * As a set , TreeSet has unique elements.
 * But TreeSet sorts the elements.
 * The value objects that we add to TreeSet should be naturally sortable.
 * That is the value objects must be imlementing Comparable interface.
 * 
 * If the value objects are not natuarallysoratable, 
 *           we need to supply a Comparator to sort the objects.
 * 
 * Using Comparators: http://www.javatpoint.com/Comparator-interface-in-collection-framework
 */
public class TreeSetCities {
	
	// natural order
	//Assignment: Tree set of cities. -- Order the cities. order by name, state
	
	
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();
		//ts.add(null);
		ts.add("Lousiana");
		ts.add("Atlanta");
		ts.add("Detroit");
		ts.add("Chicago");
		
		for(String s:ts)
		{
			System.out.println(s);

		}
		System.out.println("--------------------------A");

		
		
		
		
		
		CitySimple c1 = new CitySimple("Delhi", 123456); // City is naturally ordered becasue of Comparable interface
		CitySimple c2 = new CitySimple("Mumbai", 67776867);
		CitySimple c5 = new CitySimple("Chennai", 100000);

		CitySimple c3 = new CitySimple("Hyd", 435435);
		CitySimple c4 = new CitySimple("Chennai", 8978987);
		//TreeSet<Students> set = new TreeSet<Students>(GradeComparator);
		
		
		TreeSet<CitySimple> set = new TreeSet<CitySimple>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		set.add(c5);

		Iterator<CitySimple> itr = set.iterator();
		
		while(itr.hasNext()){
			
			CitySimple city = itr.next();
			
			System.out.println(city.getName());
			System.out.println(city.getPopulation());
			
			//System.out.println(city.getPopulation() + " " + city.getPopulation());
		};
		
		
		// loop and print
		
		
		
	}

}
