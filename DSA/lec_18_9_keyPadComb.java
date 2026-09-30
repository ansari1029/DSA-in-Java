//we have to print combination of the button keypad (NOKIA)
//0->.
//1->abc
//2->def
//3->ghi
//4->jkl
//5->mno
//6->pqrs
//7->tu
//8->vwx
//9->yz
package DSA;

public class lec_18_9_keyPadComb {

	public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void printComb(String str, int idx, String combination) {
		if(idx == str.length()) {
			System.out.println(combination);
			return;
		}
		
		char current = str.charAt(idx);
		String mapping = keypad[current - '0'];  //to get current numbers matching alphabet
		//to get each combination
		for(int i=0; i<mapping.length(); i++) {
			printComb(str, idx+1, combination + mapping.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str = "23";
		printComb(str, 0, "");

	}

}
