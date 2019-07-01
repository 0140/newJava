package sample;

/**
 * http://www.javaworld.com/article/2077424/learn-java/does-java-pass-by-reference-or-pass-by-value.html
 * 
 * @author Bhaskara Sama
 *
 */
public class PassByValEx {
	public static void main(String[] args){
		// java sample.PassArguments 6 7 9 0 
		 //System.out.println("args" + " " + args[0]);
		 
		 PassByValEx passByValEx = new PassByValEx();
		 
		 
		 int x = 15;
		 passByValEx.calculate(x); // Java always passes parameters by value 
		 							//when calling a method and passing parameter.
		 System.out.println("x=" + x);
		 
		 Dog dog_original = new Dog();
		 dog_original.setNumberOfLegs(4);
		 passByValEx.process(dog_original);
		 System.out.println("main dog NumberOfLegs=" + dog_original.getNumberOfLegs());
	}
	
	public void calculate(int n)
	{
		n++;
		System.out.println("n=" + n);
		
	}
	
	public void process(Dog dog) // pass by by reference. Never in Java . Always pass by value in java
	{
		dog.setNumberOfLegs(5);
		System.out.println("process dog NumberOfLegs=" + dog.getNumberOfLegs());
		
		/*Dog new_dog = new Dog();
		dog = new_dog;
		new_dog.setNumberOfLegs(3);*/
		
	}
	
	

}
