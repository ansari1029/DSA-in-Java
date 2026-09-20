package DSA;
import java.util.*;

public class lec_12_1_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements :");
		n=sc.nextInt();
		sc.nextLine();
		String arr[]=new String[n];
		System.out.println("Enter String Elements :");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextLine();
		}
		int total=0;
		System.out.println("Elements are :");
		for(int i=0; i<n; i++) {
			total=total+arr[i].length();
			System.out.print(arr[i]+" ");
		}
		System.out.println("Total Length is :"+total);

	}

}
