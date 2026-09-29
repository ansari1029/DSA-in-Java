package DSA;

public class lec_18_11_move0InArr {
	public static void movArr(int[] arr, int idx, int newIdx, int[] newArr) {
		if(idx == arr.length) {
			for(int element:newArr) {
				System.out.print(element+" ");
			}
			return;
		}
		if(arr[idx] == 0) {
			movArr(arr, idx + 1, newIdx, newArr);
		}
		else {
			newArr[newIdx] = arr[idx];
			movArr(arr, idx + 1, newIdx + 1, newArr);
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,0,2,3,0,0,3,6,0,7,5,0,6};
		int[] newArr=new int[arr.length];
		
		System.out.println("Original Array is :");
		for(int ele:arr)
			System.out.print(ele+" ");
		System.out.println("\nAray After mocing all the zero to the end of an array :");
		movArr(arr, 0, 0, newArr);
		

	}

}
