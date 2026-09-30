//The program is same as 18_7 only we use HashSet in this.
package DSA;
import java.util.*;

public class lec_18_8_uniqueSubSeq {
	public static void returnSubSeq(String str, int idx, String newStr, HashSet<String> set) {
		if(idx == str.length()) {
			//if dup then not print
			if(set.contains(newStr))
				return;
			//if not dup
			else {
				System.out.println(newStr);
				set.add(newStr);
				return;
			}
		}
		char currentChar = str.charAt(idx);
		
		//if string want to add
		returnSubSeq(str, idx+1, newStr+currentChar, set);
		//if not
		returnSubSeq(str, idx+1, newStr,set);

	}

	public static void main(String[] args) {
		String str = "aaa";
		HashSet<String> set = new HashSet<>();
		returnSubSeq(str, 0, "", set);

	}

}
