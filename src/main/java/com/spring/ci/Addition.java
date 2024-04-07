package com.spring.ci;

public class Addition {
private int a;
private int b;
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("int cons");
}
public Addition(double a, double b) {
	super();
	this.a = (int)a;
	this.b = (int)b;
	System.out.println("double");
}
public Addition(String a, String b) {
	super();
	this.a = Integer.parseInt(a);
	this.b = Integer.parseInt(b);
	System.out.println("string");
}
@Override
public String toString() {
	return "Addition [a=" + a + ", b=" + b + "]";
}
public void doSum() {
	System.out.println("sum is "+( this.a+this.b));
}


}
