package sample.bean;

public class InsuranceCoverage {
	
	Address addr = null;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	public static void main(String[] args)
	{
		InsuranceCoverage coverage = new InsuranceCoverage();
		
		Address address = new Address();
		address.setAddressLine1("14 Washington Rd");
		address.setAddressLine2("");
		address.setCity("Princeton JCT");
		address.setZipCode("08550");
		
		coverage.setAddr(address);
		
	}

}
