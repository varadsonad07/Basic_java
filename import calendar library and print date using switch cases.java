package com.sunbeam;

import java.util.Calendar;
import java.util.Scanner;

class AccessCalendar{
	
//	public AccessCalendar() {
//		Calendar c = Calendar.getInstance();
//		
//		int day = c.get(Calendar.DATE);
//		System.out.println("Date : " + day);
//		int month = c.get(Calendar.MONTH) + 1;
//		System.out.println("Month is : " +month);
//		int year = c.get(Calendar.YEAR);
//		System.out.println("year : " +year);
//	}
	
	public void displayalldate() {
	Calendar c = Calendar.getInstance();
	
	int day = c.get(Calendar.DATE);
	System.out.println("Date : " + day);
	int month = c.get(Calendar.MONTH) + 1;
	System.out.println("Month is : " +month);
	int year = c.get(Calendar.YEAR);
	System.out.println("year : " +year);
	System.out.println();
}
	
	Calendar c = Calendar.getInstance();

	public void displaydate() {
		int day = c.get(Calendar.DATE);
		System.out.println("date : " +day);
	}
	
	public void displaymonth() {
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month : " +month);
	}
	
	public void displayyear() {
		int year = c.get(Calendar.YEAR);
		System.out.println("year : " +year);
	}

}

public class Program {

	public static void main(String[] args) {

		AccessCalendar a = new AccessCalendar();
	
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. display today date ");
			System.out.println("2. display today month ");
			System.out.println("3. display today year ");
			System.out.println("4. display all over date");
			System.out.println("0. exit ");
			System.out.println("----------------------------");
			System.out.println("enter your choice");
			System.out.println();
			choice = sc.nextInt();
			
			switch(choice){
			
			case 1:
				a.displaydate();
				break;
				
			case 2 :
				a.displaymonth();
				break;
			
			case 3 :
				a.displayyear();
				break;
				
			case 4 :
				a.displayalldate();
				break;
				
			default:
				System.out.println("enter wrong choice");
			}
			
			
		}while(choice != 0);
		return;
	}

	

}
