package com.sunbeam;

public class Program {

	/*
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append(40);
		sb.append("varad");
		String str1 = sb.toString();
		System.out.println(str1);
		System.out.println(sb);
	}
	*/
	
	/*
	//the capacity of StringBuffer is by default 16 . when the stack is full then it can update the capacity of StringBuffer by ( (previous capacity +1)square) 
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("length : " +sb.length()+ " capacity : " +sb.capacity( ));
		sb.append(0123456);
		System.out.println("length : " +sb.length()+ " capacity : " +sb.capacity( ));
		sb.append("varad sonad");
		System.out.println("length : " +sb.length()+ " capacity : " +sb.capacity( ));
		sb.append("varad sonad");
		System.out.println("length : " +sb.length()+ " capacity : " +sb.capacity( ));
	}
	*/
	
	/*
	public static void main(String[] args) {
		// StringBuffer (since Java 1.0) is thread-safe.
		// Internally uses synchronization objects, which slow down the execution.
		// StringBuilder (since Java 5.0) is not thread-safe.
		//Not using synchronization objects, due to which it is faster than StringBuffer.
		
		StringBuilder sb = new StringBuilder();
		sb.append("my name is varad sonad ");
		StringBuilder sb1 = sb.reverse();
		System.out.println(sb1);
		String str1 = sb.toString();
		System.out.println(str1);;
		
		
	}
	*/
	
	/*
	public static void main(String[] args) {
		
		String str1 = "sunbeam";
		String str2 = "sunbeam";
		System.out.println("equal : " +str1.equals(str2));
		
		String str3 = "sunbeam";
		StringBuffer sb = new StringBuffer("sunbeam");
		System.out.println("equal :" +str3.equals(sb));
	}
	*/

}



