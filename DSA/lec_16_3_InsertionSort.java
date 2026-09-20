package DSA;
import java.util.Scanner;

public class lec_16_3_InsertionSort {

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
		
		//sorting
		for(int i=1; i<arr.length; i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && current < arr[j]) {
				//ek jagah bnayenge new element ke liye
				arr[j+1]=arr[j];
				j--;
			}
			//Placement of value(when loop not run then the element will directly gets it's current place as in the sorted part)
			arr[j+1]=current;
		}
		
		sorted(arr);
		sc.close();
	}

}
