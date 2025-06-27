
import java.util.Calendar;

class access_calendar {
	
	private int day;
	private int month;
	private int year;
	
	public access_calendar() {
		
		Calendar c = Calendar.getInstance();
		
		day = c.get(Calendar.DATE);
		System.out.print("present date is : " + day); // print day 
		System.out.println();   // for next line
		month = c.get(Calendar.MONTH) + 1;
		System.out.print("present month is : " + month) ;  // print month 
		System.out.println();
		year = c.get(Calendar.YEAR);
		System.out.print("present year is : " + year); // print year
		System.out.println();
		System.out.println();
	
    }
	
	public access_calendar(int day , int month  , int year) {
	
		System.out.println("present date , month and year is : ");
		this.day = day ;
		this.month = month;
		this.year = year;
		System.out.print("present date is : " + day); // print day 
		System.out.println();

		System.out.print("present month is : " + month) ;  // print month 
		System.out.println();

		System.out.print("present year is : " + year); // print year
		System.out.println();
	
    }
}	
	
public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	access_calendar dt1 = new access_calendar();
	access_calendar dt2 = new access_calendar(1,2,2000);

	}

}
