//to print sum of first n natural numbers
package DSA;

public class lec_17_2_Sum {

	public static void sum(int i,int n,int sum){
		if(i==n){
			sum+=i;
			System.out.println("Sum of first "+n+" natural numbers is : "+sum);
			return;
		}
		sum+=i;
		sum(i+1,n,sum);
	}
	public static void main(String[] args) {
		sum(1,5,0);
	}

}
