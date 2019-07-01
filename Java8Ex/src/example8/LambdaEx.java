package example8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sample.City;

/**
 * Lambdas –nameless block of code
   The Lambda expression is used to provide the implementation of an interface 
   which has functional interface. It saves a lot of code.
    In case of lambda expression, we don't need to define the method again 
    for providing the implementation. Here, we just write the implementation code.
 * @author bhaskar
 *
 */
public class LambdaEx {

	public static void main(String[] args) {

		MatchOperation x = (int a, int b) -> a + b;
		int m = x.operation(12, 13);
		System.out.println("m:" + m);

		List<City> listcity = new ArrayList<City>();

		City c1 = new City();
		c1.setPopulation(10000);

		City c2 = new City();
		c2.setPopulation(100000);

		listcity.add(c1);
		listcity.add(c2);

		listcity.sort((City cx, City cy) -> {
			if (cx.getPopulation() < cy.getPopulation())
				return 1;
			else
				return -1;

		});
		
		listcity.forEach( cx -> System.out.println(cx.getPopulation()));

		// TODO Auto-generated method stub
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
	}

}
