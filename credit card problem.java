/* (Credit Limit Calculator)
Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a
charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this
month
e) allowed credit limit.
The program should input all these facts as integers, calculate
the new balance (= beginning balance+ charges – credits),
display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose
credit limit is exceeded, the program should display
the message "Credit limit exceeded" */


package com.sunbeam;
import java.util.Scanner;
public class CalculateCreditLimit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number : ");
		int account_number  = sc.nextInt();
		
		System.out.println("Enetr balance at the beginning of the month : ");
		int balanceATbegining = sc.nextInt();
		
		System.out.println("Enter total of all items charged by the customer this month");
		int totalcharges = sc.nextInt();
		
		System.out.println("Enter total of all credits applied to the customer’s account this month");
		int totalcredits = sc.nextInt();
		
		System.out.println("Enetr allowed credit limit : ");
		int creditlimit = sc.nextInt();
		
		int newbalance = balanceATbegining + totalcharges - totalcredits;
		
		System.out.println("Account number : " +account_number);
		System.out.println("New balance : " + newbalance);
		
		if(newbalance > creditlimit) {
			System.out.println("Credit limit exceed");
		}
		else {
			System.out.println("Within credit limit");
		}
		System.out.println();
	
		sc.close();	
	 }

}
