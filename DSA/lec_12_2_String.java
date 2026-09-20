package DSA;
//to replace the string
import java.util.*;
public class lec_12_2_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String res="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e')
				res+='i';
			else
				res+=str.charAt(i);
		}
		System.out.println("The new String is :"+res);
		//or using jsut a method replace(oldchar, newchar)
	}

}
