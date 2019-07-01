package stream_ex;

import java.util.ArrayList;
// I thought I was using
import java.util.List;

public class StreamExJava8 {
	
	public static void main(String[] args) {
		
		/*List<String> myList =
			    Arrays.asList("a1", "c8", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
			
			myList
		    .stream()
		    .filter(s -> s.startsWith("c"))
		    .map(String::toUpperCase)
		    .sorted()
		    .forEach(System.out::println);*/
			
	List<Integer> listNum = new ArrayList<Integer>();
	listNum.add(443);
	listNum.add(24);
	listNum.add(456);
	listNum.add(33);
	listNum.add(456);
	listNum.add(4553);
	
	listNum.stream()
		.filter(i -> (i % 2 ==1))
		.sorted()
	    .forEach(System.out::println);
	

	/*occurrences.entrySet().stream()
				.filter(x -> x.getValue() > 1)
				 .forEach( (x) -> System.out.println(x.getKey() + ":" + x.getValue()));
	*///
 
	}

}
