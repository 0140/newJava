package CollectionsEx.compaatorEx;

/**
 * 
 
 * @author bhaskar
 *
 */
public class AmazonSearchResults {
	
	
	
	private String name;
	private double price;
	private RatingEnum rating;
	
	public AmazonSearchResults(String name,double price, RatingEnum rating )
	{
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public RatingEnum getRating() {
		return rating;
	}
	public void setRating(RatingEnum rating) {
		this.rating = rating;
	}
	
	public String toString() {
		
		 return "price:" + price + " " + " Rating:" + rating;
	}

}
