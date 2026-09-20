//higher Element ko last mai leke jate hain
package DSA;
import java.util.*;

public class lec_16_1_BubbleSort {
	
	public static void sorted(int ar[]) {
		System.out.println("Sorted Array is :");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements :");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		//Sorting
		//To count the iteration
		for(int i=0; i<arr.length-1; i++) {
			//To Each element
			for(int j=0; j<arr.length-i-1; j++) {
				//Swap
				if(arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		//calling array print function
		sorted(arr);

	}

}
