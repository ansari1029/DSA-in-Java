//Smallest Element ko pahle leke aate hain
import java.util.Scanner;

public class lec_16_2_SelectionSort {

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
		for(int i=0; i<arr.length; i++) {
			int smallest=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[smallest]>arr[j])
					smallest=j;
			}
			//swap
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		sorted(arr);
	}

}
