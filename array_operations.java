//  operation part
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


 //  main part 
package com.sunbeam;
import java.util.Scanner;

public class array_operarions {

	public static void main(String[] args) {
		
	 human[ ] arr = new human[4];

	 arr[0] = new human(12 , 30 , 45);
	 arr[1] = new human(12 , 30 , 45);
	 arr[2] = new human(12 , 30 , 45);
	 arr[3] = new human(12 , 30 , 45);
 
	
	
	for(int i = 0 ; i < arr.length ; i++) {

		arr[i].display();
	}
	
	}
}
