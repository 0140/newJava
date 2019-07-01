package example8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8LambdaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> l = new ArrayList<Person>();
		l.add(new Person("John", 25));
		l.add(new Person("David", 30));

		l.add(new Person("Matt", 20));

		l.add(new Person("Ryan", 30));
		
		Collections.sort(l, (Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));;
		
		l.forEach(k  -> System.out.println(k.getName())  );
		
		l.forEach(k  ->  {System.out.println(k.getName());
							System.out.println(k.getAge());}  );


	}

}
