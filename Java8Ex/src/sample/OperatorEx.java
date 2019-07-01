package sample;

import java.util.ArrayList;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int y = 34/0;
		
		ArrayList<Integer>  al = new ArrayList<Integer>();
		al.add(new Integer(78));
		al.add(45); // Autoboxing
		
		int s =  al.get(0);

		int k = (int) 34.5;
		int i = 23 / 4;

		int rem = 23 % 4;

		boolean ba = !(7 > 8);
		ba = !(7 == 8);

		// System.out.println(b);

		boolean b1 = (7 > 5) | (3 > 5);

		// System.out.println(b1);
		// Integer d1 = new Integer(8);
		Integer d = null; // (d == null)

		b1 = (d != null) && (d.intValue() < 3);
		System.out.println("b1:" + b1);

		boolean b2 = (d != null) &&  (d.intValue() < 3);

		boolean b3 = (d ==null ||  (d.intValue() < 3));

		boolean b4 = (7 > 5) || (d.intValue() < 3);

		System.out.println("b3:" + b3);

		int x = 24;

		x += 23; // x = x +23;

		x -= 4;

		x /= 3; // x = x/3;

		System.out.println("\"x=" + x);

		int i2 = 10;
		i2++;

		i2 = 12;
		i2--;

		i = 10;
		int p = ++i ;
		System.out.println("p=" + p);
		System.out.println("i=" + i);

		i = 10;
		System.out.println(i++ + ++i);  // 10 +12= 22
		System.out.println("res:" + "1" + 2);
		System.out.println("1" + 2 + 3);
		System.out.println(1 + 2 + "3"); //33
		System.out.println(1 + "2" + 3 + 4);

		int a = 2;
		int b5 = (a == 1) ? 20 : 30; // Ternary Opertor

		System.out.println("b5=" + b5);

		i = 7;
		int j = ++i;

		// i++; ++i;
		System.out.println("j:" + j);
		System.out.println("i:" + i);
		i = 10;
		// System.out.println(i++);
		System.out.println(i++);
		System.out.println(i);

		i = 10;
		System.out.println(i++ + ++i); // 10 + 12 = 22

		i = 10;

		i += 3; // i=i +3;
		i -= 2;
		i *= 3;
		i /= 2;

		Integer m = 3; // Autoboxing

		int q = m; // Autounboxing

		d = new Integer(4); // wrapper classes  Double, Boolean, Long
		d.intValue();

		if (d instanceof Integer)
			System.out.println("d instanceof Integer");

		Car car = new Car();
		// car = new BMW();

		if (car instanceof Car) {

		}

		a = 45;

		if (a > 100) {
			System.out.println("a > 100");
		} else {
			System.out.println("a <= 100");

		}

		i = 6;
		i += 2; // i = i+2;
		i -= 3;

		i *= 2;

		if (a > 100) {
			System.out.println("d instanceof Integer");

		} else if (a > 30) {
			System.out.println("d instanceof Integer");

		} else if (a > 20) {

		} else {

		}

		Car c = new Car();
		// There is a variables. a. If a is divisible by 3 print Fizz.
		// If a is divisible by 5, print Buzz.
		// If a is divisible by both 3 and 5, print Fizz Buzz.

		OperatorEx operator = new OperatorEx();
		operator.process();
		// int g = operator.process2();
		Integer h = operator.process3();
		// int j5 = operator.process3(); // Autounboxing for primitive values
		// operator.calculate();
		
		Vehicle v = new Car();
		v = new Bus();
		
		if(v instanceof Car) {
			
		} else if(v instanceof Bus) {
			
		}
		
		
		
		// two integers m = 3, n= 7; Exchange the values between the two. 
		//Do not use third variable.
		
		 a = 3; 
		 int b =7;
		 
		 b = a +b; //10
		 a = b - a; //10 -3 = 7
		 b = b - a; // 10 - 7 = 3

	}

	void process() {

	}

	int process2(int n) {
		return 3;
	}

	Integer process3() {
		ArrayList  al = new ArrayList();
		al.add(new Integer(78));
		al.add(45); // Autoboxing
		
		String s = (String) al.get(0);
		
		Integer c = new Integer(8);
		// return c;
		return null; // autoboxing
		
		
	}

	void calculate() {
		int end = Integer.MAX_VALUE;
		int start = Integer.MAX_VALUE - 100;

		int count = 0;
		for (int n = start; n <= end; n++) {
			count++;
			System.out.println(count);

		}

	}

}
