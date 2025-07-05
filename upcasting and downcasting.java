package com.sunbeam;
class A{

	public void print() {
		System.out.println("a.print");
	}
	
	public void show() {
		System.out.println("a.show");
	}
}

class B extends A{
	
	public void print() {
		System.out.println("b.print");
	}
	
	public void display() {
		System.out.println("b.display");
	}
}

public class Program {

	public static void main(String[] args) {

		// simple inheritance 
//		A a = new A();
//		a.print();
//		a.show();
//		
//		B b = new B();
//	    b.print();
//	    b.display();
//	    b.show();
	    
		// UPCASTING and DOWNCASTING
	    A a1 = new B(); // UPCASTING
	    a1.print(); // output is b.print ( its called dynamic method dispatch )
	    a1.show();
	   
	    B b1= (B) a1; // DOWNCASTING
	    b1.print(); 
	    b1.show();
		
	}

}
