package sample;

public class Cow extends Animal {
	
	public Cow(boolean isMammal,boolean isCarnivorous )
	{
		super(isMammal, isCarnivorous);

	}
	 
	@Override
	public String getGreeting() {
		//Moo. It is Mammal. Not Carnovorous.
		
		StringBuffer sb = new StringBuffer();
		sb.append("Moo. It is:");
		if(isMammal) sb.append("Mammal. ");
		if(!iscarnivorous) sb.append(" Not Carnovorous.");
		 
		//System.out.println(sb.toString());
		return sb.toString();
	}

	
	
	public static void main(String[] args) {
		Cow cow = new Cow(true, false);
		//Dog dog = new Dog(true, true);
		//Duck duck = new Duck(false, false);
		System.out.println(cow.getGreeting());
		//System.out.println(dog.getGreeting());
		//System.out.println(duck.getGreeting());
		 
		
	}

}
