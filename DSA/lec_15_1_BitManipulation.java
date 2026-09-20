//Toggle a bit by pos
package DSA;
import java.util.*;

public class lec_15_1_BitManipulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		System.out.println("Enter the Position to Toggle :");
		int pos=sc.nextInt();
		System.out.println("Enter the Bit you want to Toggle (1/0)");
		int bit=sc.nextInt();
		int BitMask=1<<pos;
		int res=0;
		int NotBitMask=(~BitMask);
		if(bit ==1)
			res=BitMask | n;
		else if(bit==0)
			res=NotBitMask & n;
		else
			System.out.println("You Entered Wrong Toggle Number");
		System.out.println("The Toggled Number is "+res);
	}

}