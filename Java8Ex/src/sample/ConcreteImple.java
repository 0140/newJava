package sample;

public  class ConcreteImple extends AbstractEx {
	
	ConcreteImple() {
		super(23, true);		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteImple c = new ConcreteImple();
		c.process();

	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("process");
		
		
	}

	

}
