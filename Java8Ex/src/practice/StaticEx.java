package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticEx {
	
	double d = 23.9;
	static double x; // may need 10 lines of code
	
	static {
		x = 67.8;
		 
	}
	
	public static String getDayOfToday()
	{
	 
		 
		int f = 4;
		
		Date date = new Date();
		SimpleDateFormat frm = new SimpleDateFormat("E");
		SimpleDateFormat frm2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

		String day = frm.format(date);
		
		System.out.println(frm2.format(date));
		System.out.println(day);
		return day;
	}
	
	public static void main(String[] args) {
		 
		System.out.println(StaticEx.x);
		//System.out.println(StaticEx.d);
		
		StaticEx st = new StaticEx();
		String s = st.getDayOfToday();
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);


	}

}
