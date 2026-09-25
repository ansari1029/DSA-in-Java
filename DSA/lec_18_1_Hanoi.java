 //Program for Tower of Hanoi
package DSA;

public class lec_18_1_Hanoi {
	public static void towerOfHanoi(int n, String src, String hlp, String dst) {
		if(n==1) {
			System.out.println("Transfer Disk "+n+" from "+src+" To "+dst);
			return;
		}
		towerOfHanoi(n-1, src, dst, hlp);  //Transferring all the disk to helper except last
		
		System.out.println("Transfer Disk "+n+" from "+src+" To "+dst);
		towerOfHanoi(n-1, hlp, src, dst);
	}

	public static void main(String[] args) {
		int n=4;
		towerOfHanoi(n, "S", "H", "D");

	}

}
