package CollectionsEx;

/**
 * Bean POJO ValueObject VO
 * http://www.tutorialspoint.com/javaexamples/java_methods.htm
 * 
 * @author Bhaskara Sama
 *
 */
public class CitySimple implements Comparable<CitySimple>{
	private String name;
	private long population;
	private String state;

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	/**
	 * No arguments constructor -- default constructor
	 */
	public CitySimple() {
		 

	}

	public CitySimple(String name, long population) {
		this.name = name;
		this.population = population;

	}
	
 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected long getStaffCount() {
		return 20;
	}

	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;		
	}

	public int getYear() // default access
	{
		return 1;
	}
	
	@Override
	/**
	 * ==, equals
	 * 
	 * 
	 */
	public boolean equals(Object o)
	{
		if (!(o instanceof CitySimple) )
		{
			return false;
		}
		
		CitySimple c = (CitySimple) o;
		if (c.getName().equals(this.getName()) 
				&& c.getState().equals(this.getState())
						&& c.getPopulation() == this.getPopulation())
		{
			return true;
		} else
		{
			return false;
		}
		
		/*
		 * City c1= new City();
		 * City c2 = new City();
		 * 
		 * if (c1 == c2)
		 * 
		 * if(c1.equlas(c2))
		 */
		
	}
	
	/*
	 * If equals true for two objects, hashCode must be same for 
	 * 		both objects as well
	 * 
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		int hashCode = name.hashCode();
		hashCode = hashCode * 32 + getState().hashCode();
		hashCode = hashCode * 32 + new Long(getPopulation()).hashCode();
		
		return hashCode;
	}

	/*
	 * City is naturally ordered becasue of Comparable interface
	 * CitySimple c1 = new CitySimple("Delhi", 123456); 
	 * CitySimple c2 = new CitySimple("Mumbai", 67776867);		
	 * c1.compareTo(c2) -- -1,0, +1
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(CitySimple incoming) {  
		// -1, this comes first, +1 this object comes later , 0 they are equal
		 
		if ( this.name.equals(incoming.name))
		{
			if (this.population == incoming.population)
			{
				return 0;
			} else if (this.population > incoming.population)
			{
				return 1;
			} else 
			{
				return -1;
			}
		} else
		{
			return this.name.compareTo(incoming.name);
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		CitySimple city = new CitySimple();
		city.setName("ATL");
		city.setPopulation(200); // 20 attributes, 20 lines of code to populate values
		
		CitySimple city2 = new CitySimple("ATL", 200); // One line of code enough
		
		
		
	}

}
