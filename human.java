package com.sunbeam;

public class human {

	private int age ;
	private int height;
	private int weight;
	
	public human() {
		
	}
	
	public human(int a , int h , int w) {
		this.age = a;
		this.height = h;
		this.weight = w;
	}
	
	public void display() {
		System.out.printf("age : %d  height : %d  weight : %d\n" ,age , weight , height);
	}
}
