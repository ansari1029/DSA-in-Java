//Switch Case Example

package DSA;
import java.util.*;

public class lec_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,ch;
		
		System.out.println("Enter Number 1 :");
		n1 = sc.nextInt();
		System.out.println("Enter NUmber 2 :");
		n2 = sc.nextInt();
		System.out.println("Enter Choice 1->+, 2->-, 3->*, 4->/, 5->%");
		ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Addition is :"+(n1+n2));
			break;
		case 2:
			System.out.println("Subtracton is :"+(n1-n2));
			break;
		case 3:
			System.out.println("Multiplication is :"+(n1*n2));
			break;
		case 4:
			System.out.println("Division is :"+(n1/n2));
			break;
		case 5:
			System.out.println("Remainder is :"+(n1%n2));
			break;
		default:
			System.out.println("Incorrect Choice");
		}

	}

}
