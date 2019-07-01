package sample;

import java.util.Scanner;

public class ScannerEx {
	
	  int i = 9;

	public static void main(String[] args) {
		
		/*//System.out.println("argumrnts:" + args[0] + " " + args[1] + args[2]);
		Scanner sc = new Scanner(System.in);
		//sc.process(6);
		System.out.println("Enter your rollno");
		int rollno = sc.nextInt();
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your fee");
		double fee = sc.nextDouble();
		System.out.println("Enter long data:");

		long valForL = sc.nextLong();
		System.out.println("Long:" + valForL);
		System.out
				.println("Rollno:" + rollno + " name:" + name + " fee:" + fee);
		sc.close();
		*/
		ScannerEx cl = new ScannerEx();
		cl.process();
		//Arrays.cop
	}
	// read an input from command line. pass it as parametr to method. 
	// The method has an array. Print the contents of array.
	// Skip printing the array value, if it is equal to parameter.
	public void process() {
		 long x = 30;
		 long result = 1;
		 for(int i=1; i <= x; i++) {
			 result = result * i;
			 System.out.println("result:" + result);
		 }
		
	}

}
