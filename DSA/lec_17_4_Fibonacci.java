package DSA;

public class lec_17_4_Fibonacci {
	public static void Fibo(int fno, int sno, int n) {
		if(n==0)
			return;
		int sum=fno+sno;
		System.out.println(sum);
		Fibo(sno, sum, n-1); //it call as Fibo(fno, sno, n)
		
	}

	public static void main(String[] args) {
		int fno=0, sno=1, n=6;
		System.out.println(fno+"\n"+sno);
		Fibo(fno, sno, n-2); //because we already printed 2 values 0,1 (5-2)=3 Total 5 values
		

	}

}
