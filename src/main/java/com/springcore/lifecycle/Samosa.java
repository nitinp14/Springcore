package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("inside init method");
	}
	public void destroy() {
		System.out.println("destroy method h bhaiya ye");
	}
	
}
