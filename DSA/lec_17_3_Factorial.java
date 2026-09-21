//To calculate the factorial of a number using recursion
package DSA;

public class lec_17_3_Factorial {
	
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int fact_nm1=factorial(n-1);
		int fact_n=n*fact_nm1; //(5*4)->(4*3)->(3*2)->(2*1)
		return fact_n;
	}

	public static void main(String[] args) {
		int n=5; //(5*4*3*2*1=120)
		System.out.println("Factorial of "+n+" is "+factorial(n));

	}

}
