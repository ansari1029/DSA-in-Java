package DSA;

public class lec_18_7_subseqStr {
	public static void returnSubSeqStr(String str, int idx, String newStr) {
		if(idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		char currentChar = str.charAt(idx);
		//if string want to add
		returnSubSeqStr(str, idx+1, newStr+currentChar);
		//if not
		returnSubSeqStr(str, idx+1, newStr);
	}

	public static void main(String[] args) {
		String str = "abc";
		System.out.println("Original String :"+str);
		returnSubSeqStr(str, 0, "");

	}

}
