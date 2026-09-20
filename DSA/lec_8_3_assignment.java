//Greatest Divisor of two Numbers
package DSA;
import java.util.*;

public class lec_8_3_assignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers :");
		int n1,n2,le;
		n1=sc.nextInt();
		n2=sc.nextInt();

		int res=0;
		for(int i=1; i<=Math.min(n1, n2); i++) {
			if(n1%i==0 && n2%i==0)
				res=i;
		}
		System.out.println("Greatest Divisor of two Number is :"+res);
	}
}

//Example: 12 and 18

//Divisors of 12:
//1, 2, 3, 4, 6, 12
//Divisors of 18:
//1, 2, 3, 6, 9, 18

//Common divisors:
//1, 2, 3, 6

//The greatest one is:
//GCD = 6

//Because:
//12 ÷ 6 = 2  → remainder 0
//18 ÷ 6 = 3  → remainder 0