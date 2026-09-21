//Spiral of the Array
package DSA;
import java.util.*;

public class lec_11_2_Spiral_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c;
		
		System.out.println("Enter the Row for the Array :");
		r=sc.nextInt();
		System.out.println("Enter the column for the Array :");
		c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter Array Elements :");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The 2D Matrix of Array is :");
		for(int i=0; i<r; i++) {
			System.out.print("|");
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("|");
		}
		
		System.out.println("The Spiral of the Matrix is :");
		int rowStart=0,rowEnd=r-1,colStart=0,colEnd=c-1;
		while(rowStart <= rowEnd && colStart <= colEnd) {
			//------>
			for(int i=colStart; i<=colEnd; i++) {
				System.out.print(arr[rowStart][i]+" "); //arr[0][1],arr[0][2],arr[0][3]...
			}
			rowStart++;
			//|
			//|
			//|
			//V
			for(int i=rowStart; i<=rowEnd; i++) {
				System.out.print(arr[i][colEnd]+" "); //arr[1][3],arr[2][3],arr[3][3]....when colEnd=3
			}
			colEnd--;
			//<--------
			for(int i=colEnd; i>=colStart; i--) {
				System.out.print(arr[rowEnd][i]+" "); //arr[3][2],arr[3][1],arr[3][0]...when matrix is 3x3
			}
			rowEnd--;
			//^
			//|
			//|
			//|
			for(int i=rowEnd; i>=rowStart; i--) {
				System.out.print(arr[i][colStart]+" "); //arr[2][0],arr[1][0]
			}
			colStart++;
		}
	}

}
