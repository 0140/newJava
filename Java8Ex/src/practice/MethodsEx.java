package practice;

public class MethodsEx {

	static double d = 45.2;
	int x = 5;

	
	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		MethodsEx mtd = new MethodsEx();
		mtd.calc2();
		String result = mtd.whatIsToday();
		System.out.println("result:" + result);
		
		int m = 20;
		int n = 7;
		int x = mtd.sum(m, n);

		 //calc2();
		int a = mtd.sum(4,  5);
		System.out.println("a=" + a);
		process();

		 
		int[] arr = { 89, 3, 66, 345,82,  0, 77, -123 };
		mtd.printArray(arr);
		
		double[] d = {3, 6.7, 8.3, 8    };
		double[] res = mtd.incrementByAverage(d);
		
		Vehicle v = new Vehicle();
		v.manufacturer = "";
		
		int w = 34;
		MethodsEx methodsEx = new MethodsEx();
		double d2 = methodsEx.tang(w);
		System.out.println("d2=" + d2);
		
		//double d2 = methodsEx.tang(3,4,5,6,9,9);

	}
	
	double tang(int n) {
 		double s =  Math.tan(n);
		return s;
		
	}
	
	 

	void calc2() {
		
		//x= 4;
		int i = 45;
		i++;
		System.out.println("Hello" + i);
	}
	
	String whatIsToday() {
		int i = 3;
		if( i==3) {
			return "MONDAY";
		} else {
			return "TUESDAY";
		}
	}
	
	int sum(int n, int p) {
		process();
		int s = n+ p;
		return s;
		
	}
	
	static void process() {
		System.out.println("process" );
		 
	}
	
	
	public double[] incrementByAverage(double[] args) {
		
		int sum = 0;
		
		for(int i=0;i < args.length; i++ ) {
			
			sum+=args[i]; // sum= sum + args[i]
		}
		
		double avg = sum/args.length;
		
		for(int i=0;i < args.length; i++ ) {
			args[i] = args[i] + avg;
		}
		
		return args;
		
	}
	 
	void printArray(int[] numbarr) {
		
		for(int i:numbarr) {
			
			if (i==77) continue;
			System.out.println(i);
		}
	}
	
	
	
	
	 
	 
	
}
