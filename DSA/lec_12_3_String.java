package DSA;
//to extract only the username from the email 
import java.util.*;

public class lec_12_3_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email");
		String str=sc.nextLine();
		String res="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='@')
				break;
			else
				res+=str.charAt(i);
		}
		System.out.println("The username is :"+res);
	}
}