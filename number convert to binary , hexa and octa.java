
import java.util.Scanner;

public class convert_number_to_binary_hexa_octa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter number : ");

		
		int num = sc.nextInt();
		
		System.out.print("Given number is : " + num);
		System.out.println();

		System.out.print("COnvert to Binary : " + Integer.toBinaryString(num));
		System.out.println();

		System.out.print("COnvert to Octa : " + Integer.toOctalString(num));
		System.out.println();

        System.out.print("Convert to Hexa : " + Integer.toHexString(num).toUpperCase());
		System.out.println();

        
        sc.close();

	}

}
