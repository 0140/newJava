package sample.bean;

public class Customer {

	private String name;

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private CreditCard cc; // Has a relation

	public String getName() {
		return name;
	}

	/**
	 * Verizon interview: Can I make only subclasses access in other packages??
	 * Can I make it accessible in current class only?
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public CreditCard getCc() {
		return cc;
	}

	public void setCc(CreditCard cc) {
		this.cc = cc;
	}
	
	

}
