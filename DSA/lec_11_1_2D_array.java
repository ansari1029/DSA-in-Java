//2D array

package DSA;
import java.util.*;

public class lec_11_1_2D_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c,x;
		boolean flag=false;
		
		System.out.println("Enter the Number of rows :");
		r=sc.nextInt();
		System.out.println("Enter the Number of Columns :");
		c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		
		System.out.println("Enter Array Elements :");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the Number you want to find :");
		x=sc.nextInt();
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(x==arr[i][j])
				{
					flag=true;
					System.out.print("The Number "+x+" is found at ["+i+","+j+"]");
			
				}
			}
		}
		if(!flag)
			System.out.print("The Number "+x+" is not present");
		
		//to find the transpose of a matrix you need to print the matrix like this 
		//Traverse i to the column and j to the row instead of from row to column).

	}
}