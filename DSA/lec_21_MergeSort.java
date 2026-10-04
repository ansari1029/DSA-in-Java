//It uses divide and Conquer rule 
package DSA;

public class lec_21_MergeSort {
	
	public static void conquer(int[] arr, int s_idx, int mid, int e_idx) {
		//create new array which store merge array
		int[] merged = new int[e_idx - s_idx + 1];  //to the size of arr
		
		int idx1 = s_idx; //to trace first half array
		int idx2 = mid + 1; //to trace second half array
		int x = 0; //to trace merge array;
		
		//perform sorting
		while(idx1 <= mid && idx2 <= e_idx) {
			//if first part has small ele then add it to merge array
			if(arr[idx1] <= arr[idx2]) {
				merged[x] = arr[idx1];
				x++; idx1++;
			}
			else {
				//if second part has small ele then add it to merge array
				merged[x++] = arr[idx2++]; //second way to use ++
			}
		}
		
		//both while is for the condition when the some elements of the second array is ->
		//remains because the comparision is done and then some elements remains
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while(idx2 <= e_idx) {
			merged[x++] = arr[idx2++];
		}
		
		//copy merged array in the original array
		for(int i=0, j=s_idx; i<merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}
	
	public static void divide(int[] arr, int s_idx, int e_idx) {
		//BASE condition 
		if(s_idx >= e_idx) {
			return;
		}
		//Divide the array in 2 parts
		int mid = s_idx + (e_idx - s_idx) / 2;
		
		//call first half of the array
		divide(arr, s_idx, mid);
		
		//call second part of the array
		divide(arr, mid + 1, e_idx);
		
		//call conquer function to merge the array
		conquer(arr, s_idx, mid, e_idx);
		
		
	}

	    public static void main(String[] args) {
	    	int[] arr = {11,2,5,1,7,4,7,10};
	    	int n = arr.length;
	    	
	    	//call for sorting
	    	divide(arr, 0, n-1);
	    	for(int i=0; i<n; i++) {
	    		System.out.print(arr[i]+" ");
	    	}
	    }
	
}
