package DSA;

public class lec_18_2_RevStr {
	public static void stringRev(String str, int idx) {
		if(idx == 0)
		{
			System.out.print(str.charAt(idx));
			return;
		}	
		System.out.print(str.charAt(idx));
		stringRev(str, idx-1);
	}

	public static void main(String[] args) {
		String str ="Asad";
		System.out.println("Original String :"+str);
		System.out.println("Reversed String :");
		stringRev(str,str.length()-1);

	}

}
