package com.chintha.spring.springcoreadvance.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	Customer(String Reservation){
		this.setReservation(Reservation);
	}
    public String getReservation() {
		return Reservation;
	}
	public void setReservation(String reservation) {
		Reservation = reservation;
	}
	@Autowired
	private String Reservation;
	@Override
	public String toString() {
		return "Customer [Reservation=" + Reservation + "]";
	}

	
	
}
