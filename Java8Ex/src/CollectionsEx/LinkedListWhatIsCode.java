package CollectionsEx;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

/*
 *   Java LinkedList class can be used as list, stack or queue.
 *   Java LinkedList class uses doubly linked list to store the elements. 
 *   In Java LinkedList class, manipulation is fast because 
 *            no shifting needs to be occurred.
 *         In ArrayList when we modify the contents, shifting will occur.


 *  In LinkedList ,Each node stores its own data 
 *                     and a pointer (address) to the location of the next node.
 *   The last link in a linked list points to null, indicating the end of the chain.
 *   
   Advantages of a Linked List: 
       Insertions and deletions are quick.   Because LinkedList has no shifting.   
       
   Disadvantages of a Linked List
       Random access is slow. Objects in a linked list must be accessed sequentially,
        therefore, it can be slow to access a specific object.
        
        Memory is a concern. Each object in a linked list requires data as well as one
        (or more) pointers to other objects in the linked list.
 
 
    When to Use a Linked List?

       We don’t need random access to any specific elements.
       We need to do constant insertions and deletions.
  * -----------------------------------------------------------------------

 *   Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
 * a linked list is a linear data structure.
 *  a linked list is a sequence of nodes. 
 *   --------------------
 *   It provides a linked-list data structure. 
 *   It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:




https://www.javatpoint.com/difference-between-arraylist-and-linkedlist

 *   Also unlike an array, where each array element is stored contiguously (each element has a consecutive memory address), linked list elements are not stored contiguously.
 *   
 * 1) Each link in a linked list is an object (also called an element, node ).
   2) Each object holds a reference (an address) to the location of the next object.
   3) The last link in a linked list points to null, indicating the end of the list.
   4) A linked list can grow and shrink dynamically at run-time 
      , limited only by the amount of physical memory available.

   
 * 
 * 
 * http://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
 * Find the middle of a given linked list in C and Java
 * http://javarevisited.blogspot.in/2012/12/how-to-find-middle-element-of-linked-list-one-pass.html
 * 
 * https://en.wikipedia.org/wiki/Linked_list
 * 
 *  Production Ordering of Steps in Engineering.
 *  Each assemby line floor location has a Robot.
 *  The Robots can be instructed using LinkedList.
 *  Because each step points to next step.
 *  Iterating through faster.
 *  
 *   
 *  
 *  
 *  
 *  
 */
public class LinkedListWhatIsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://en.wikipedia.org/wiki/Linked_list
		// o(log n)

		 List<String> list = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>(); // FIFO is Queue

		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		System.out.println("linkList:" + queue.size());

		String o = queue.poll(); // FIFO // Poll removes the first eleement
		System.out.println("poll:" + o);
		
		System.out.println("linkList:" + queue.size());

		System.out.println("peek:" + queue.peek());
		System.out.println("linkList:" + queue.size());
		

		Deque<String> d = new LinkedList<String>(); // Stack // LIFO
		d.add("Three");
		d.add("One");
		d.add("Two");

		String s =  d.poll(); // LIFO == Stack
		System.out.println("peek for Stack:" + s);
		s =  d.poll();
		System.out.println("peek for Stack 2:" + s);


		d.poll(); // Gives the element from top of stack
		
		LinkedList l = new LinkedList();
		
		//---------------------------------------------
		// Backward direction
		ListIterator<String> li3 = list.listIterator();
		while (li3.hasNext()) {
		    //if you need to go to the previous place
		    if (li3.hasPrevious()) {
		    	li3.previous();
		        //further logic here...
		    }
		}

		/*
		 * 3) Adding element in ArrayList Adding element in ArrayList is O(1)
		 * operation if it doesn't trigger re-size of Array, in which case it
		 * becomes O(log(n)) , On the other hand appending(middle) an element in
		 * LinkedList is O(1) operation, as it doesn't require any navigation.
		 * 
		 * 4) Removing element from a position In order to remove an element
		 * from a particular index e.g. by calling remove(index), ArrayList
		 * performs a copy operation which makes it close to O(n) while
		 * LinkedList needs to traverse to that point which also makes it
		 * O(n/2), as it can traverse from either direction based upon
		 * proximity.
		 * 
		 * http://stackoverflow.com/questions/2307283/what-does-olog-n-mean-exactly
		 * Read more:
		 * http://www.java67.com/2012/12/difference-between-arraylist-vs-LinkedList-java.html#ixzz4YFB3pNUR
		 */
		
		/*
		 *  https://beginnersbook.com/2013/12/difference-between-arraylist-and-linkedlist-in-java/
		 *  
		 *   * a linked list is a linear data structure.
 *  a linked list is a sequence of nodes. 
 *  Each node stores its own data and a pointer (address) to the location of the next node.
 *   The last link in a linked list points to null, indicating the end of the chain.


		 * LinkedList and ArrayList difference:  
		 *  LinkedList is list, stack and queue also.
		 *  ArrayList is only dynamic list.
		 *  
		 *  ArrayList has index only and faster when accessing 
		 *  based or adding elements in general. 
		 *  
		 *  LinkedList faster when adding and removing elements in the middle
		 *   because only previous and next pointers to be adjusted…
		 *    
		 *   
		 *    Advantages of a Linked List: 
       Insertions and deletions are quick.
       If we add a eleemnt in the middle,
               all the elements to the next of that should be adjusted for index.
       Grows and shrinks as needed.
       
   Disadvantages of a Linked List
       Random access is slow. Objects in a linked list must be accessed sequentially,
        therefore, it can be slow to access a specific object.
        
        Memory is a concern. Each object in a linked list requires data as well as one
        (or more) pointers to other objects in the linked list.
 

		*/
		
		ArrayList<String> listString = null;
		 

	}

}
