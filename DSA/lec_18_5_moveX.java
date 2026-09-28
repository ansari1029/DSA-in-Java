//move all the 'x' to the end of the string
package DSA;

public class lec_18_5_moveX {
	
	public static void repAllx(String str, int idx, int cnt, String newStr) {
		if(idx == str.length()) {
			for(int i=0; i<cnt; i++) {
				newStr += 'x';
			}
			System.out.println("New String with all 'x' t the end is :"+newStr);
			return;
		}
		char currentChar = str.charAt(idx);
		if(currentChar == 'x') {
			cnt++;
			repAllx(str, idx+1, cnt, newStr);
		}
		else {
			newStr += currentChar;
			repAllx(str, idx+1, cnt, newStr);
		}
		
	}
	public static void main(String[] args) {
		String str = "axsxadx";
		System.out.println("The Original string without removing x :"+str);
		repAllx(str, 0, 0, "");

	}

}
