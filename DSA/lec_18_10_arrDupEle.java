package DSA;

public class lec_18_10_arrDupEle {
	public static boolean chkArray(int[] arr, int idx) {
		if(idx == arr.length-1) {
			return true;
		}
		if(arr[idx] == arr[idx+1])
			return false;

		return chkArray(arr, idx+1);
		
	}

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 4};
		if(chkArray(arr, 0))
			System.out.println("All array elements are unique");
		else
			System.out.println("Not all array elements are unique");
	}

}
