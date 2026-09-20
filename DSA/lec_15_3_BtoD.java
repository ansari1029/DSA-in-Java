//To convert from Binary to Decimal and vice versa
package DSA;
import java.util.*;

public class lec_15_3_BtoD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Coice (0->Binary to Decimal) OR (1->Decimal to Binary)");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Enter the Decimal Number :");
			int decimal=sc.nextInt();
			String binary=Integer.toBinaryString(decimal);
			System.out.println("The Binary of "+decimal+" is :"+binary);
		}
		else if(ch==0) {
			System.out.println("Enter Binary Number :");
			String bin=sc.next();
			int decimal=Integer.parseInt(bin,2);
			System.out.println("The Decimal of ("+bin+") is :"+decimal);
		}
		else
			System.out.println("You Enter Wrong Choice");
	}

}
