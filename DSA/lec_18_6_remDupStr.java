package DSA;

public class lec_18_6_remDupStr {
	public static boolean[] map = new boolean[26]; //because (a-z)=26
	
	public static void remDuplicateStr(String str, int idx, String newStr) {
		if(idx == str.length()) {
			System.out.println("New String after removing duplicates :"+newStr);
			return;
		}
		
		char currentChar = str.charAt(idx);
		//if Char is Found as True in the Map then don't add it to new Str
		if(map[currentChar - 'a']) {
			remDuplicateStr(str, idx+1, newStr);
		}
		//if char is False then add it to the new string
		else {
			newStr += currentChar;
			//make it True so that we can identify that the char is found once
			map[currentChar - 'a'] = true;
			remDuplicateStr(str, idx+1, newStr);
		}
	}

	public static void main(String[] args) {
		String str = "abbcddcaba";
		System.out.println("The Original String is :"+str);
		
		remDuplicateStr(str, 0, "");

	}

}
