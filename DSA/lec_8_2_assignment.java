package DSA;
import java.util.*;

public class lec_8_2_assignment {
	
	static void fibo(int n) {
		int fno=0;
		int sno=1;
		int tno=0;
		System.out.print(fno+"\n"+sno+"\n");
		for(int i=2; i<n; i++) {
			tno=fno+sno;
			fno=sno;
			sno=tno;
			System.out.println(tno);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for Fibonacci Series :");
		int l=sc.nextInt();
		fibo(l); //only static function can be called in the static method

	}

}