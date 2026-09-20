//find mix max value in the array

package DSA;
import java.util.*;

public class lec_10_2_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,min,max,arr[];
		System.out.println("Enter the size of array :");
		n=sc.nextInt();
		arr=new int[n];
		
		System.out.println("Enter Array Elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Max value is "+max+" and Min value is "+min);
	}

}
