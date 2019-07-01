package sample;

public class Car implements Vehicle {

	String vinid;
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub

	} 

	@Override
	public void applyBrakes(int distance) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public double speed() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getVinid() {
		return vinid;
	}

	public void setVinid(String vinid) {
		this.vinid = vinid;
	}
	
	

}
