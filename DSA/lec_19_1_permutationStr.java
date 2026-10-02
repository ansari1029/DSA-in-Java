//Return all the combination of string TC=O(n!)
package DSA;

public class lec_19_1_permutationStr {
	public static void printPermutation(String str, String permutation) {
		if(str.length() == 0) {
			System.out.println(permutation);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			//it removes current character from the string (current =a (abc)->(bc))
			String newStr = str.substring(0, i) + str.substring(i+1);
			printPermutation(newStr, permutation + currentChar);
		}
		
	}

	public static void main(String[] args) {
		String str = "abc";
		System.out.println("String is :"+str+"\n");
		
		System.out.println("Permutations (all combinations) are :");
		//it will return output in length as (3!) because length of string is 3
		printPermutation(str, "");

	}

}
