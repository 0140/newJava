package sample.subpack2;

 import sample.subpack.MethodsEx;

public class SubClassEx extends MethodsEx {

	public static void main(String[] args) {
		MethodsEx acc = new MethodsEx();
		//acc.defaultProcess();
		//acc.privateEx();
		acc.publicEx();
	    //acc.protectedProcess();
		
	}
	
	public void callNext() {
		protectedProcess();
		
	}

}
