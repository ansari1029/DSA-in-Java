package DSA;

import java.util.*;
public class lec_4_loops{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,cnt=0;
		System.out.println("Enter the Number to check prime or not :");
		n = sc.nextInt();
		for(i=1; i<=n; i++) {
			if((n%i)==0) {
				cnt ++;
			}
		}
		if (cnt == 2)
			System.out.println(n+" Is Prime Number..");
		else
			System.out.println(n+" Is Not a Prime Number..");

//		while(i<=10) {
//			System.out.println(n*i);
//				i++;
//		}
//		do {
//			sum = sum + i;
//			i++;
//		}while(i<=n);
//		System.out.println("Sum is :"+sum);
	}

}
