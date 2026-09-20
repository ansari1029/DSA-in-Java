package DSA;

import java.util.*;
public class lec_5_patterns {

	public static void main(String[] args) {
//		// Solid Rectangle 
//		*****
//		*****
//		*****
//		*****
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//Hollow Rectangle
//		*****
//		*	*
//		*	*
//		*****
//		int n=5,m=4;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=m; j++) {
//				if(i==1 || j==1 || i==n || j==m) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
//		//Half Pyramid
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
		
		
		
//		//Inverted Half Pyramid
//		
//		for(int i=5; i>=1; i--) {
//		for(int j=1; j<=i; j++) {
//			System.out.print("* ");
//		}
//		System.out.println("");
//		}
		
		
		
		
//		//Inverted Half Pyramid (Rotated by 180')
//		
//		int n=3;
//		for(int i=1; i<=n; i++) {
//			//For Spaces
//			for(int k=1; k<=(n-i); k++) {
//				System.out.print(" ");
//			}
//			//For *
//			for(int j=1; j<=i; j++) {
//					System.out.print("*");
//					//System.out.println(" *"); //Replace this to print full pyramid
//			}
//			System.out.println();
//		}
		
		
		
		
//		//Number half pyramid
//		1
//		12
//		123
//		1234
//
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		
		
//		//Inverted half Pyramid with numbers
//		int n=5;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		
		
		//Floyd's Triangle
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		int cnt=1;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(cnt+" ");
//				cnt++;
//			}
//			System.out.println();
//		}
		
		
		
		
		//0-1 Triangle
//		1
//		01
//		101
//		0101
//		10101
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				if((i+j)%2==0) { //even value
//					System.out.print("1 ");
//				}else { //odd value
//					System.out.print("0 ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		//solid rhombus
//		    *****
//		   *****
//		  *****
//		 *****
//		int n=5;
//		for(int i=1; i<=n; i++) {
//			for(int k=1; k<=n-i; k++) { //for spaces
//				System.out.print(" ");
//			}for(int j=1; j<=n; j++) {
//					System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		//Number Pyramid
//		   1
//		  2 2
//		 3 3 3
//		4 4 4 4
//		for(int i=1; i<=5; i++) {
//			for(int k=1; k<=5-i; k++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print(" "+i);
//			}
//			System.out.println();
//		}
		
		
		
		
		//Palindromic number Pyramid
		int n=5;
		for(int i=1; i<=n; i++) {
			//For Space
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			//Decreasing  loop
			for(int j=i; j>=1; j--) {
				System.out.print(j+"");
			}
			//Increase Number Loop
			for(int j=2; j<=i; j++) {
				System.out.print(j+"");
			}
			System.out.println();
		}
		 
		
	}

}