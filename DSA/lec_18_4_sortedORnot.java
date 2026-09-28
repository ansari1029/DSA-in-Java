//To find weather the arary is sorted or not (Strictly Increasing)
//1,2,3,4,4 (not sorted) | 1,2,3,4(sorted)
package DSA;

public class lec_18_4_sortedORnot {
	public static boolean isSorted(int[] arr, int idx) {
		if(idx == arr.length-1) {
			return true;
		}
		if(arr[idx] < arr[idx + 1])
			//whenever array get smaller ele than current it directly return false like above eg
			return isSorted(arr,idx+1);
		else
			return false;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		if(isSorted(arr, 0))
			System.out.println("Array Is strictly Sorted");
		else
			System.out.println("Array Is Not strictly Sorted");

	}

}
