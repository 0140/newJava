package CollectionsEx;

public class Country { // POJO or Bean or ValueObject

	private String name;
	private long population;

	public Country(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		 this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	/*private String item;
    private int price;
     
    
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }*/

	@Override
	public boolean equals(Object obj) {

		Country other = (Country) obj;
		if (name.equalsIgnoreCase((other.name)))
			return true;
		return false;
	}

}
