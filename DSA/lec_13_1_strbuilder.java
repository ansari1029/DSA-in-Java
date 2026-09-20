package DSA;

import java.util.Scanner;

//To reverse a string

public class lec_13_1_strbuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Asad");
		System.out.println("Original String :"+sb);
		for(int i=0; i<sb.length()/2; i++) {
			int front=i;
			int back=sb.length()-1-i;
			
			char frontChar=sb.charAt(front);
			char backChar=sb.charAt(back);
			
			sb.setCharAt(front,	backChar);
			sb.setCharAt(back, frontChar);
		}
		System.out.println("Reversed String :"+sb);

		
		//To Extract user name form email using StringBuilder
//		StringBuilder res=new StringBuilder("");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter you email");
//		StringBuilder str=new StringBuilder(sc.nextLine());
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)=='@') {
//				break;
//			}
//			else
//				res.append(str.charAt(i));
//			
//		}
//		System.out.println("Your User Name is :"+res);

	}

}
