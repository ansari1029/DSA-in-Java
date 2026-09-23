//n Power m using logn call stack
package DSA;

public class lec_17_6_nPowerm {
	public static int calcPower(int n, int m) {
		if(n==0)
			return 0;
		if(m==0)
			return 1;
		
		//if m is Even
		if(m % 2 == 0)
			return calcPower(n, m/2) * calcPower(n, m/2);
		//if n is Odd
		else
			return calcPower(n, m/2) * calcPower(n, m/2) * n;
   	}

	public static void main(String[] args) {
		int n=2, m=5;
		int res = calcPower(n, m);
		System.out.println(n+"^"+m+" is :"+res);

	}

}
