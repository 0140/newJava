package sample;

/**
 * http://www.tutorialspoint.com/javaexamples/java_methods.htm
 * 
 * @author Bhaskara Sama
 *
 */
public class City {
	private   String name = "Chicago";
	private Practice p;
	private long population;
	
	
	
	public City() {
		this("Raleigh");
		//this.setP(null);
	}
	
	public City(String name) {
		this.name = name;
	}
 

	public Practice getP() {
		return p;
	}

	public void setP(Practice p) {
		this.p = p;
	}

	public City(String name, Practice p) {
		this.name = name;
		this.p = p;
		 

	}
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected int getStaffCount() {
		return 20;
	}

	public String getState() {
		return "UT";
	}

	public int getYear() // default access
	{
		return 1;
	}
	
	
	
	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	/**
	 * ==, equals
	 * 
	 * 
	 */
	public boolean equals(Object o)
	{
		if (!(o instanceof City) )
		{
			return false;
		}
		
		City c = (City) o;
		if (c.getName().equals(name) && c.getState().equals(this.getState()))
		{
			return true;
		} else
		{
			return false;
		}
		
		
	}
	
	public void isTheCitySmart() {
		
	}
	
	@Override
	public int hashCode()
	{
		int hashCode = name.hashCode();
		hashCode = hashCode * 32 + getYear();
		
		return hashCode;
	}
	
	public static void main(String[] args)
	{
		City c = new City();
		System.out.println(c.getName());
		c.setName("JKL");
		
		Practice p = new Practice();
		c.setP(p);
		
		// Customer. Address. 
	}

}
