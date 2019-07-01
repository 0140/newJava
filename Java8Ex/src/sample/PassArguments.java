package sample;

/**
 * http://www.javaranch.com/campfire/StoryPassBy.jsp
 * 
 * @author Bhaskara Sama
 *
 */
public class PassArguments {
	
	public static void main(String[] args){
		// java sample.PassArguments 6 7 9 0 
		 System.out.println("args" + " " + args[0]);
		 
		 int pVar = 25;
		 
		 int g =calculate(pVar);
		 System.out.println(pVar);
		 
		 City c = new City();
		 c.setName("NY");
		 
		 rename(c);
		 
		 System.out.println("Name:" + c.getName());
	}
	
	public static  int calculate(int m)
	{
		m= 30;
		return m;
	}
	
	public static void rename(City city)
	{
		city.setName("NJ");
	}

}
