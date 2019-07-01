package com.aug09.oops;

public class MobileCar {

	private String owner;
	private String vinid;
	private boolean leather;

	public MobileCar() {
		// Used to initialize default attribute values.
		owner = "Toyota Corp";
		this.isLeather();
	}

	public MobileCar(String owner, String vinid, boolean leather) {
		super();
		this.owner = owner;
		this.vinid = vinid;
		this.leather = leather;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getVinid() {
		return vinid;
	}

	public void setVinid(String vinid) {
		this.vinid = vinid;
	}

	public boolean isLeather() {
		return leather;
	}

	public void setLeather(boolean leather) {
		this.leather = leather;
	}

}
