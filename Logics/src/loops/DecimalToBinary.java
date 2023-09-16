package loops;

public class DecimalToBinary {

	public static void main(String[] args) {
		int no=15;
		String total="";
		while(no>=1) {
			int rem=no%2;
			total=rem+total;//this format is must
			no=no/2;
		}
		System.out.println(total);
	}

}
