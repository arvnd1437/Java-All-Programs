package PatternPragrame;

public class StarPattern {

	public static void main(String[] args) {
		StarPattern sp = new StarPattern();
//		sp.demo1();
//		sp.demo2();
//		sp.demo3();
		sp.demo4();
		

	}

	private void demo4() {
		for(int row=1;row<=6;row++) {
			for (int col=6;col>=row;col++) {
				
				System.out.print("  ");
			}
			for(int i=1;i<=row;i++) {
				System.out.print("* ");
			}
			
				
			System.out.println();
		}
	}

	private void demo3() {//Print right angle triangle
		for(int row=1;row<=6;row++) {
			for(int col=6;col>=row;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void demo2() {
		for(int row=1;row<=6;row++) {
			for (int col=1;col<=row;col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void demo1() {
	for(int row=1;row<=6;row++) {
		for (int col=1;col<=6;col++) {
			
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
