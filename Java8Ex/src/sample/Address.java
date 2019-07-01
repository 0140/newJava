package sample;

public class Address implements Comparable {

	String addr1;
	String addr2;
	String city;
	String zip;
	
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public int compareTo(Object o) {
		
		Address addr = (Address) o;
		if ( addr1.compareTo(addr.getAddr1()) > 1)
		{
			return 1;
		} else if ( addr1.compareTo(addr.getAddr1()) == 0)  {
			return 0; 
		} else {
			return -1;
		}
		//return 0;
	}
	
	/*@Override
	public int compareTo(Object 0) {
		

		return 1;

			
	}*/
	
	
}
