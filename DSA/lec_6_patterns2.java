package DSA;

public class lec_6_patterns2 {

	public static void main(String[] args) {
//		//Butterfly Pattern
////		*      *
////		**    **
////		***  ***
////		********
////		********
////		***  ***
////		**    **
////		*      *
//		
//		for(int i=1; i<=4; i++) {
//			//for 1st Part of star
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			
//			//for spaces 2*(n-i)
//			int space = 2*(4-i);
//			for(int k=1; k<=space; k++) {
//				System.out.print(" ");
//			}
//			
//			//for 2nd part of star
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=4; i>=1; i--) {
//			for(int j=i; j>=1; j--) {
//				System.out.print("*");
//			}
//			int space = 2*(4-i);
//			for(int k=1; k<=space; k++) {
//				System.out.print(" ");
//			}
//			for(int j=i; j>=1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		//Solid Rhombus
////	     *****
////	    *****
////	   *****
////	  *****
////	 *****
//		for(int i=1; i<=5; i++) {
//			for(int k=1; k<=(5-i); k++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		//Dimond Pyramid
////		    *
////		   ***
////		  *****
////		 *******
////		 *******
////		  *****
////		   ***
////		    *
//		for(int i=1; i<=4; i++) {
//			for(int k=1; k<=(4-i); k++) {
//				System.out.print(" ");
//			}
//			int limit = (2*i)-1;
//			for(int j=1; j<=limit; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=4; i>=1; i--) {
//			for(int k=1; k<=(4-i); k++) {
//				System.out.print(" ");
//			}
//			int limit = (2*i)-1;
//			for(int j=1; j<=limit; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//	 	//hollow Rhombus
////	     *****
////	    *   *
////	   *   *
////	  *   *
////	 *****
//		
//		
//		for(int i=1; i<=5; i++) {
//			for(int k=1; k<=(5-i); k++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=5; j++) {
//				if(j==1 || j==5 || i==1 || i==5)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
//		//Pascal's Triangle (There is Parscal's Numeric Formula to print this).which is Main Line
//		
////	     1 
////	    1 1 
////	   1 2 1 
////	  1 3 3 1 
////	 1 4 6 4 1 
//
//		
//		int n=5; 
//		for(int i=1; i<=n; i++) {
//			for(int k=1; k<=(n-i); k++) {
//				System.out.print(" ");
//			}
//			int next=1;
//			for(int j=1; j<=i; j++) {
//				System.out.print(next+" ");
//				next = next * (i-j) / (j);
//			}
//			System.out.println();
//		}
		
//		//inverted half pyramid
////		1 1 1 1 1 
////		2 2 2 2 
////		3 3 3 
////		4 4 
////		5 
//		int n=5,cnt=1;
//		for(int i=n; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(cnt+" ");
//			}
//			cnt++;
//			System.out.println();
//		}
		
		
		
		//Hollow butterfly
		
//		*        *
//		**      **
//		* *    * *
//		*  *  *  *
//		*   **   *
//		*   **   *
//		*  *  *  *
//		* *    * *
//		**      **
//		*        *
		
		int n=5;
		for(int i=1; i<=n; i++) {
			//left side and inner space
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//spaces
			int limit=2*(n-i);
			for(int k=1; k<=limit; k++) {
				System.out.print(" ");
			}
			//Right side and inner spaces
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		//lower part of the code
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			int limit=2*(n-i);
			for(int k=1; k<=limit; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}