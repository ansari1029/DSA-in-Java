//find the first and last occurance of the string
package DSA;

public class lec_18_3_FnLPosStr {
	public static int first=-1;
	public static int last=-1;
	public static void cntOcc(String str, int idx,char element) {
		if(idx == str.length()) {
			System.out.println("First Occurence At :"+first);
			System.out.println("Last Occurance At :"+last);
			return;
		}
		char currentChar = str.charAt(idx);
		if(currentChar == element) {
			if(first == -1)
				first=idx;
			else
				last=idx;
		}
		cntOcc(str, idx+1, element);
	}

	public static void main(String[] args) {
		String str="Asad Ansari";
		cntOcc(str, 0, 'a');

	}

}
