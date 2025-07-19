// *** it is a main program ***

//package com.sunbeam;
//
//public class Program {
//
//	public static void main(String[] args) {
//
//		try {
//			
//			Time t1 = new Time();
//			
//			t1.sethours(1);
//			t1.setmins(1);
//			t1.setsec(1);
//			System.out.println(t1.toString());
//		} catch (InvalidTimeException e) {
//			System.out.println("invalid field is : " +e.getinvalidField());
//			System.out.println("invalid value is : "+e.getinvalidValue());
//			System.out.println("message : " +e.getmessage());
//		}
//	}
//
//}

// *** hete we can create a exception handlig class ***

//package com.sunbeam;
//
//public class InvalidTimeException extends Exception{
//
//	private String invalidField;
//	private int invalidValue;
//	
//	public  InvalidTimeException() {
//		
//	}
//	
//	public InvalidTimeException(String field , int value) {
//		this.invalidField = field;
//		this.invalidValue = value;
//	}
//	
//	public String getinvalidField() {
//		return invalidField;
//	}
//	public void setinvalidField(String field) {
//		this.invalidField = field;
//	}
//	
//	public int getinvalidValue() {
//		return invalidValue;
//	}
//	public void setinvalidValue(int value) {
//		this.invalidValue = value;
//	}
//	
//	public String getmessage() {
//		return "invalidfield = " +getinvalidField()+ " , invalidvalue = " +getinvalidValue();
//	}
//}

// *** here we can ctrate a class time and print the time in hours , minutes and seconds *** 

//package com.sunbeam;
//
//public class Time {
//
//	private int hours;
//	private int mins;
//	private int sec;
//	
//	public Time() {
//		
//	}
//	
//	public Time(int h , int m , int s) {
//		this.hours = h;
//		this.mins = m;
//		this.sec = s;
//	}
//	
//	public int gethours() {
//		return hours;
//	}
//	public void sethours(int h) throws InvalidTimeException{
//		if(h < 0 || h > 24) {
//			throw new InvalidTimeException("hours" , h );
//		}
//		this.hours = h;
//	}
//	
//	public int getmins() {
//		return mins;
//	}
//	public void setmins(int m) throws InvalidTimeException{
//		if (m < 0 || m > 60) {
//			throw new InvalidTimeException("mins" , m);
//		}
//		this.mins = m;
//	}
//	
//	public int getsec() {
//		return sec;
//	}
//	public void setsec(int s) throws InvalidTimeException {
//		if(s < 0 || s > 60) {
//			throw new InvalidTimeException("sec" , s);
//		}
//		this.sec = s;
//	}
//	
//	public String toString() {
//		return "hours = "+ gethours()+ " , mins = " +getmins()+ " ,  sec = " +getsec();
//	}
//}
