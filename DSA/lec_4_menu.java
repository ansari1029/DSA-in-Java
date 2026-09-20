//Menu Driven Program in Java...
package DSA;

import java.util.*;
public class lec_4_menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input,m;
		do {
			System.out.println("Enter the Marks of student out of 100");
			m=sc.nextInt();
			if(m>=90)
				System.out.println("This is Very Good..");
			else if(m>70)
				System.out.println("This is Good..");
			else
				System.out.println("You need to improve your self..");
			System.out.println("Do you like to continue ? (0->No, 1->Yes)");
			input=sc.nextInt();
			if(input==0)
				System.out.println("Thank you..");
		}while(input==1);

	}

}
