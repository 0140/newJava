package sample;

public class RecursionSumOfN {

	public static void main(String[] args) {
		RecursionSumOfN n = new RecursionSumOfN();
		System.out.println(n.sum(6));
	}
	
	public int sum(int n) {
	    if (n >= 1) {
	        return sum(n - 1) + n;
	    }
	    return n;
	}

}
