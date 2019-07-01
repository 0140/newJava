package sample.subpack;

import sample2.TestAccess;

public class  MethodsEx {

	public static void main(String[] args) {
		TestAccess t = new TestAccess();
		//t.m();
		MethodsEx acc = new MethodsEx();
		acc.defaultProcess();
		acc.privateEx();
 		acc.protectedProcess();
 		
 		MethodsEx.processst();
	}
	
	 void defaultProcess() {
		System.out.println("default process");
	}
	 
	 protected void protectedProcess() {
			System.out.println("default process");
		}
		
	
	 private void privateEx() {
			System.out.println("privateEx");
		}
	 
	 public void publicEx() {
			System.out.println("publicEx");
		}
	 
	 
	static void processst() {
		System.out.println("processst");
	}

}
