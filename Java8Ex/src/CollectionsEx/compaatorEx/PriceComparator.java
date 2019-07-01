package CollectionsEx.compaatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 *   Sort by Price.If price is same, sort by rating.
 * 
 * @author bhaskar
 *
 */
public class PriceComparator implements Comparator<AmazonSearchResults>{

	@Override
	public int compare(AmazonSearchResults o1, AmazonSearchResults o2) {
		if(o1.getPrice() == o2.getPrice() ) {
			return o1.getRating().compareTo(o2.getRating());
		} else if (o1.getPrice() > o2.getPrice()) {
			
				return 1;
		} else {
			return -1;
		}

		 
	}
	
	public static void main(String[] args) {
		
		AmazonSearchResults res1 = new AmazonSearchResults("One", 33.3, RatingEnum.FOURSTAR);
		AmazonSearchResults res2 = new AmazonSearchResults("Two", 39, RatingEnum.FIVESTAR);
		AmazonSearchResults res3 = new AmazonSearchResults("Three", 46, RatingEnum.THREESTAR);
		AmazonSearchResults res4 = new AmazonSearchResults("Four", 46, RatingEnum.TWOSTAR);
		
		
		TreeSet s= new TreeSet(new PriceComparator());
		s.add(res1);
		s.add(res2);
		s.add(res3);
		s.add(res4);
		
		s.forEach(System.out::println);
		//s.forEach(k ->  System.out.println(k) );

		System.out.println("--------------------------------------");
		
		List<AmazonSearchResults> list = new ArrayList<AmazonSearchResults>();
		list.add(res1);
		list.add(res2);
		list.add(res3);
		list.add(res4);
		
		// How we sort elements of a List?
		Collections.sort(list, new PriceComparator());
		list.forEach(System.out::println);

		int[] arr = {1, 2, 3   };
		Arrays.sort(arr );
		/*
		List<int> listOfInteger = Arrays.asList(arr);
		Collections.sort(listOfInteger, new PriceComparator());*/
	}
	

}
