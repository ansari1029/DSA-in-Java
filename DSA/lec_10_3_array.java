//to find the array is sorted or not
package DSA;
import java.util.*;

public class lec_10_3_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,min,max,arr[];
		boolean isSorted=true;
		System.out.println("Enter the size of array :");
		n=sc.nextInt();
		arr=new int[n];
		
		System.out.println("Enter Array Elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length-1; i++) { //here length-1 is for compare a[i+1]
			if(arr[i]>arr[i+1])
				isSorted = false;
		}
		if(isSorted)
			System.out.println("The Array is Sorted in Ascending Order");
		else
			System.out.println("The Array is not Sorted");
	}

}