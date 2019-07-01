package CollectionsEx;

import java.util.Map;
import java.util.TreeMap;

public class CitySimpleSorting {

	public static void main(String[] args) {

		TreeMap<CitySimple, CitySimple> tree = new TreeMap<CitySimple, CitySimple>();

		CitySimple city1 = new CitySimple("Hyd", 100000);
		CitySimple city2 = new CitySimple("CHN", 30000);
		CitySimple city3 = new CitySimple("CHN", 92000);
		CitySimple city4 = new CitySimple("CHN", 35000);

		city1.setState("NJ");
		city2.setState("NJ");
		city3.setState("NJ");
		city4.setState("NJ");

		tree.put(city1, city1);
		tree.put(city2, city2);
		tree.put(city3, city3);
		tree.put(city4, city4);

		for (Map.Entry<CitySimple, CitySimple> entry : tree.entrySet()) {
			System.out.println("key ->" + entry.getKey().getName() + ", value->" + entry.getKey().getPopulation());
		}

	}

}
