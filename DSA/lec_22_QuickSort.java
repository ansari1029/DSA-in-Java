package DSA;

public class lec_22_QuickSort {
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; //it will make last element as a pivot
		int i = low-1; //khali jagah track kar rha hai pivot se pahle wale take sabko add kar sake
		
		for(int j=low; j<high; j++) { //j<high means go with n-1 index bcs last element is pivot which is already sorted
			if(arr[j] < pivot) {
				i++; //to make 1 place for elements less than pivot
				
				//swap with the element we just found smaller(arr[j]<pivot) with the element at index i(wo khali jagah) 
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++; //to make jagah for the pivot bcs it is at the end
		//now swap the pivot with its right place with the i index (extra khali jagah)
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		
		return i; //pivot index
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		
		if(low < high) {
			int pidx = partition(arr, low, high); //it will give index of pivot element
			
			quickSort(arr, low, pidx-1);  //to sort the elements less than pivot
			quickSort(arr, pidx+1, high); //to sort the elements greater than pivot
		}
	}

	public static void main(String[] args) {
		int[] arr = {6, 3, 9, 5, 2, 8};
		int n = arr.length;
		
		System.out.println("Original Array :-");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		quickSort(arr, 0, n-1);
		System.out.println("The sorted array with the Quick Sort is :-");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
