package DSA;
import java.util.*;

public class lec_8_1_assignment {

	public static void main(String[] args) {
		int n,p=0,ne=0,z=0;
		char ch;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("Enter Number :");
			n=s.nextInt();
			if(n>0)
				p++;
			else if(n==0)
				z++;
			else
				ne++;
			System.out.println("Do you Want to Continue?(Y/N)");
			ch=s.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		System.out.println("Total Positive Numbers :"+p);
		System.out.println("Total Negative Numbers :"+ne);
		System.out.println("Total Zero Numbers :"+z);
		s.close();
	}

}
