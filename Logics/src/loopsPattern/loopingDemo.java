package loopsPattern;

public class loopingDemo {

	public static void main(String[] args) {
		int no=123456;
		while(no>0) {
			int rem=no%100;
			System.out.print(rem+" ");
			no=no/10;
			
		}

	}

}
