package CollectionsEx;

import java.util.HashMap;
import java.util.Map;

public class KangarooMeeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean verify(int x1, int x2, int b1, int b2, int numberOfHops) {
		Map<Integer, Integer> firstKangarooPoints =  new HashMap<Integer, Integer>(); // saving distance, time
		Map<Integer, Integer> secondKangarooPoints =  new HashMap<Integer, Integer>(); // // saving distance, time
		 
		// whether they will converge before maxDistance. 
		//There needs to be a configurable limit.
		// We can call the method maytimes, as we increase maxdistance..and increase x1..in a loop
		// we can keep increasing.. maxDistance..
		// Loop and call the method. in next maxDistance. they meet and that can continue indefinitely..
		// There is no limit on which we can verify..
		int currentPosition = x1;
		int time = 0;
		
		for (int i=0; i<numberOfHops; i++ ) { // numberOfHops is parameter
			
			firstKangarooPoints.put(time, currentPosition); 
			x1 = x1 +b1;
			time++;
		}
		
		currentPosition = x2;
		time = 0;
		
		for (int i=0; i<numberOfHops; i++ ) {
			
			secondKangarooPoints.put(time, currentPosition); 
			x2 = x2 +b2;
			time++;
		}
		
		// Now, we verify whether same position for same time
		boolean meeting = false;
	    
		for(int i=0; i< numberOfHops; i++) {
			int postion1 = firstKangarooPoints.get(time);
		 
			int position2 = secondKangarooPoints.get(time);
 			if(postion1 == position2) meeting = true;
 			if (meeting) System.out.println("Meeting at:" + postion1 + " at time "+ time);
		}

		return meeting;
	}


}
