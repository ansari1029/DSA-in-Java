//count the number of 0&1 in the Decimal Number
package DSA;
import java.util.*;
public class lec_15_2_Cnt01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int cnt=0;
		while(n>0) {
			if((n & 1)==1)
				cnt++;
			n=n>>1;
		}
		System.out.println("Number of 1's are :"+cnt);

	}

}
