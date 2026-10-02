package DSA;

public class lec_19_3_countTilePlacement {
	public static int countPlacement(int n, int m) {
		if(n == m)
			return 2;
		if(n < m)
			return 1;
		
		//vertical placement
		int verticalPlacement = countPlacement(n-m, m);
		
		//horizontal placement
		int horizontalPlacement = countPlacement(n-1, m);
		
		return verticalPlacement + horizontalPlacement;
	}

	public static void main(String[] args) {
		int n=4, m=2;
		int totalCount = countPlacement(n, m);
		System.out.println("Total Number of counts of Tiles placed for "+n+" x "+m+" floor is :"+totalCount);

	}

}
