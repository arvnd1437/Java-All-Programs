package loops;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int no=12345;
		int sum=0;
		while(no>0) {
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		System.out.println(sum);
	}

}
