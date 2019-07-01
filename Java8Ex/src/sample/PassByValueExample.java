package sample;

/**
 * https://www.javaworld.com/article/2077424/learn-java/does-java-pass-by-reference-or-pass-by-value.html
 * 
 * @author bhaskar
 *
 *java method parameters -- the values are copied from other variables
 *Original variables are never
 *
 *
 */
public class PassByValueExample {
	
	
	public int process(int n)
	{
		n = n+2;		
		return n;
	}
	
	public void process(City c)
	{
		 c.setName("Atlanta");
		 //process(4);		 
	}	

	public static void main(String args[]) {
		
		 System.out.println("webdriver.chrome.driver 2");		 
		 
		 int loc = 10;
		 PassByValueExample p = new PassByValueExample();
		 int x = p.process(loc); // Pass by value
		 
		 System.out.println("loc:" + loc);
		 System.out.println("x:" + x);
		 
		 City c1 = new City();
		 c1.setName("Princeton");
		 p.process(c1);
		 System.out.println(c1.getName());
    }
}
