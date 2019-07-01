package CollectionsEx;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap introduced in java 5 and is very similar to Hashtable 
 * but it provides better concurrency level.

 * In ConcurrentHashMap there is a Segment Array. 
 * Segments are specialized versions of hash tables
 * 
 * When we say, ConcurrentHashMap locks only part of the Map. It locks segments.
 * It actually locks a Segment. So  if two threads are  writing 
 * into different segments in same ConcurrentHashMap, 
 * it allows write operation without any conflicts.
 * 
 * what is difference between ConcurrentHashMap 
 * and Collections.synchronizedMap(Map)
 * 
 * In case of Collections.synchronizedMap(Map), it locks whole HashTable object 
 * but in ConcurrentHashMap, it locks only part of it - Segment.
 * Another difference is that ConcurrentHashMap will not throw 
 * ConcurrentModification exception if we try to modify ConcurrentHashMap
 *  while iterating it.
 *  
 *  HashMap Vs ConcurrentHashMap
 *  1.oncurrentHashMap is thread-safe that is   access to ConcurrentHashMap is 
 *  Synchronized while HashMap is not thread-safe .
 *  
 *  2. HashMap can be synchronized by using  Colllections.synchronizedMap(HashMap)  
 *  method . This locks the whole HashMap. Even, Hashtable, the whole Hashtable
 *  is locked.  ConcurrentHashMap locks only segments.
 *  
 *  3. ConcurrentHashMap does not allow NULL key, null values .
 *   So the key can not be null in ConcurrentHashMap. 
 *   While In HashMap there can only be one null key. Multiple null values.
 *   
 *  4. Performance. ConcurrentHashMap performs better 
 *  than Colllections.synchronizedMap(HashMap).
 *   In general HashMap is faster, because no synchronization is done.
 *  
 *  5. When we are performing operations like adding & deleting objects
 *   at same time( I mean concurrently ), then   HashMap 
 *   throws ConcurrentModification Exceptions. But in ConcurrentHashMap, 
 *   no Exception is thrown.
 */
public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		/**
		 * http://javahungry.blogspot.com/2014/02/hashmap-vs-concurrenthashmap-java-collections-interview-question.html
		 *https://www.java2blog.com/concurrenthashmap-in-java/
		 */

		Country india = new Country("India", 1000);
		Country japan = new Country("Japan", 10000);

		Country france = new Country("France", 2000);
		Country russia = new Country("Russia", 20000);

		
		ConcurrentHashMap<Country, String> countryCapitalMap = new ConcurrentHashMap<Country, String>();
		countryCapitalMap.put(india, "Delhi");
		countryCapitalMap.put(japan, "Tokyo");
		countryCapitalMap.put(france, "Paris");
		countryCapitalMap.put(russia, "Moscow");

		Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();
		// put  point at this line
		while (countryCapitalIter.hasNext()) {
			Country countryObj = countryCapitalIter.next();
			String capital = countryCapitalMap.get(countryObj);
			System.out.println(countryObj.getName() + "----" + capital);
		}
		
		// Map<String,String> syncMap = Collections.synchronizedMap(map);


	}

}
