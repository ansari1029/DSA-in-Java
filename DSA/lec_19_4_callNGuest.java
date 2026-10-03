package DSA;

public class lec_19_4_callNGuest {
	public static int returnGuest(int n) {
		if( n<= 1)
			return 1;
		int way1 = returnGuest(n-1);
		int way2 = (n-1) * returnGuest(n-2);
		
		return way1 + way2;
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println("Total Number of ways to invite "+n+" Guest in Pairs or single is :"+returnGuest(n));
	}

}
