package DSA;
import java.util.*;


//make a function and return the factorial of a number
public class lec_7_functions {
	
	static void fact(int n) {
		int sum=1;
		if(n>=0) {
		for(int i=1; i<=n; i++) {
			sum = i*sum; 
		}
		System.out.println("The Factorial of "+n+" is :"+sum);
		}
		else
			System.out.println("Can't find factorial of negative number!!");
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number 1 :");
		n=sc.nextInt();
		fact(n);
	}

}
