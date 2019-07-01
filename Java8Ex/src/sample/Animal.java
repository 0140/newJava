package sample;

/**
 * We
 * 
 * @author bhaskar
 *
 */
public abstract class Animal {

	protected boolean isMammal;
	protected boolean iscarnivorous;

	public Animal(boolean isMammal, boolean isCarnivorous) {
		this.isMammal = isMammal;
		this.iscarnivorous = isCarnivorous;
	}
	
	

	 public abstract String getGreeting();

}

/*
 * Write three sub classes to Animal class.
 * 
 * Each animal needs to greet: Cow -- Moo. It is Mammal. Not Carnovorous. Dog --
 * Wuff. It is Mammal. Carnovorous. Duck -- Quack. It is no Mammal. No
 * Carnovorous.
 * 
 * Call the getGreeting on all Animals. Verify the greeting.
 */
