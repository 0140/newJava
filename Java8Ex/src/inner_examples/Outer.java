package inner_examples;

 
class Outer { 
   private String name = "JohnDavid";   
   void outerMethod() { 
      System.out.println("inside outerMethod"); 
   } 
   
   private class Inner { 
     /* public static void main(String[] args){ 
    	  // The method main cannot be declared static; 
    	  // static methods can only be declared in a static or top level type
         System.out.println("inside inner class Method"); 
      } */	   
	   public void show() { 
           System.out.println("In a nested class method"); 
           System.out.println(name); // Nested Inner class can access any private instance variable of outer class. 

      } 
   } 
   
   public static void main(String[] args) { 
       Outer.Inner in = new Outer().new Inner(); 
       in.show(); 
   } 
}