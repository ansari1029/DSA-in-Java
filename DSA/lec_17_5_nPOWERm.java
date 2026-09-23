//n power m using n call stack
package DSA;

public class lec_17_5_nPOWERm {
	public static int calPower(int n, int m) {
		if(n==0)
			return 0;
		if(m==0)
			return 1;
		int nPowm_m1 = calPower(n, m-1);
		int nPower = n * nPowm_m1;
		return nPower;
	}

	public static void main(String[] args) {
		int n=2, m=3;
		int ans=calPower(n, m);
		System.out.println("The Answer of "+n+" to the Power "+m+" is :"+ans);

	}

}
