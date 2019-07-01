package sample.subex;

public class TVBroadCast implements BroadCast{

	@Override
	public void sendOutNews() {
		// TODO Auto-generated method stub
		//Transmit audio and video
		
	}

	@Override
	public void sendOutEmergencyBulletin() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		BroadCast broadCast = new TVBroadCast();
		
		broadCast = new RadioBroadCast(); // Loose coupling
		
	}
 
}
