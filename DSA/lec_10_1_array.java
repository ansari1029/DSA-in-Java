package DSA;
import java.util.*;
public class lec_10_1_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,f,arr[];
		System.out.println("Enter the size of Index :");
		n=sc.nextInt();
		arr=new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Elements at Index "+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Number you want to find :");
		f=sc.nextInt();
		for(int i=0; i<n; i++) {
			if(arr[i]==f)
				System.out.println("The Number "+f+" is present at Index "+i);
		}
	}

}
