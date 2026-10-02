package DSA;

public class lec_19_2_cntPaths {
	public static int countPaths(int i, int j, int n, int m) {
		//when we are on boundary there is no path
		if(i==n || j==m) {
			return 0;
		}
		//when there is only one path at boundary-1
		if(i==n-1 && j==m-1) {
			//means only one path is there
			return 1;
		}
		
		//downwards direction
		int downPaths = countPaths(i+1, j, n, m);
		
		//right direction
		int rightPaths = countPaths(i, j+1, n, m);
		
		return downPaths + rightPaths;
	}

	public static void main(String[] args) {
		int n=3, m=4;
		int totalPaths = countPaths(0, 0, n, m);
		System.out.println("Total Number of Paths of a matrix "+n+" x "+m+" is :"+totalPaths);

	}

}
