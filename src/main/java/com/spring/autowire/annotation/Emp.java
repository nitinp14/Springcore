package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	
	private Address adress;

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		System.out.println("setting in emp class");
		this.adress = adress;
	}

	

	@Override
	public String toString() {
		return "Emp [adress=" + adress + "]";
	}

	public Emp(Address adress) {
		super();
		this.adress = adress;
	}
	
}
