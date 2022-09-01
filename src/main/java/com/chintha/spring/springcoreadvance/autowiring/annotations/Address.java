package com.chintha.spring.springcoreadvance.autowiring.annotations;

public class Address {
	
	private int hno;
	private String address;
	private String colony;

	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", address=" + address + ", colony=" + colony + "]";
	}

	
}
