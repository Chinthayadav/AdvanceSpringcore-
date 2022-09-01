package com.chintha.spring.springcoreadvance.standalone.collections;

import java.util.List;


public class Productlist {
	
	private List<String> productnames;

	public List<String> getProductnames() {
		return productnames;
	}

	public void setProductnames(List<String> productnames) {
		this.productnames = productnames;
	}

	@Override
	public String toString() {
		return "Productlist [productnames=" + productnames + "]";
	}
	

}
