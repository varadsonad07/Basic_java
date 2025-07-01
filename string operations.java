package com.sunbeam;

public class Program {

//	public static void main(String[] args) {
//
//		// String class in Java -- represents immutable "sequence of characters"
//				// length() returns number of chars
//				// charAt() returns char at given index -- 0 to length()-1
//				// "str" reference is created on "stack"
//				// "Sunbeam" string literal/constant is created on String pool (in heap)
//		
//		//// IMP ////
//		//  String str = " sunbeam " ( a sunbeam string is created in heap on string pool )
//		// string str = new string( " sunbeam " )  // this sunbeam is created on only heap ( not in string pool )
//	
//	    String str = "sunbaeam"; // created on string pool
//	    System.out.println("lenth : " +str.length());
//	    
//	    for (int i = 0 ; i < str.length() ; i++) {
//	    	char ch = str.charAt(i);
//		    System.out.println(ch);
//	    }
//	    str.toString();
//	    System.out.println(str);
//	
//	}
	
//	public static void main(String[] args) {
//		//length(), charAt()(String is a class in java represents immutable "sequence of chars") 
//		//new String objects are created on heap 
//		
//		String str = new String("sunbeam");  // this string is created on only heap
//		System.out.println(str);
//		for (int i = 0 ; i < str.length() ; i++) {
//			char ch = str.charAt(i);
//			System.out.println(ch);
//		}	
//	}
	
//	public static void main(String[] args) {
//		
//		// we can access the elements at which index
//		
//		String str = "sunbeam";
//		char ch = 'e';
//		int index = str.indexOf(ch);
//		System.out.println("index of " +ch+ " at " +index);
//		
//		char ch1 = 's';
//		int index1 = str.indexOf(ch1);
//		System.out.println("index of " +ch+ " at " +index1);
//	}

	
//	public static void main(String[] args) {
//		//toUpperCase(), toLowerCase()(// strings are immutable.
//	    // operations performed on string will create a new object with modified contents.
//		
//		String str1 = " i am varad";
//		String str2 = str1.toUpperCase();
//		System.out.println(str1);
//		System.out.println(str2);
//		String str3 = str2.toLowerCase();
//		System.out.println(str1);
//		System.out.println(str2);
//		
//	}
	
//	public static void main(String[] args) {
//		
//		// concat() method for join the two strings
//		
//		String str1 = "i am";
//		String str2 = "varad";
//		String str3 = str1.concat(str2);
//		System.out.println(str3);
//	}	

//	public static void main(String[] args) {
//		//split()
//		
//		String str1 = "i am varad sonad ";
//		String[] parts = str1.split("");
//		for(String part : parts) {
//			System.out.println(part);
//		}
//	}
	
//	public static void main(String[] args) {
//		//trim() -- trim() removes leading and trailing spaces from the string
//		String str1 = "          my name is varad       ";
//		String str2 = str1.trim();
//		System.out.println(str2);
//	}
	
//	public static void main(String[] args) {
//		//format(); 
//		String str1 = "balu born in year";
//		int year = 2003;
//		String str2 = String.format("%s %d",str1, year);
//		System.out.println(str2);
//	}
}         
