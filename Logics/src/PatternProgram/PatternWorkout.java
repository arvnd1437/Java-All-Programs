package PatternProgram;

public class PatternWorkout {

	public static void main(String[] args) {
		PatternWorkout pw=new PatternWorkout();
//		pw.demo1();
//		pw.demo2();
//		pw.demo3();
//		pw.demo4();
//		pw.demo5();
		pw.demo6();

	}

	private void demo6() {
		for(int col=5;col>=1;col--)			for(int row=1;row<=col;row++) {
				System.out.print(col+ " ");
 {
			}
			System.out.println();
		}
	}

	private void demo5() {
		for(int col=5;col>=1;col--) {
			for(int row=1;row<=col;row++) {
				System.out.print(row+ " ");
			}
			System.out.println();
		}
	}

	private void demo4() {
		for(int no=1; no<=2; no++) {
			for(int no1=1; no1<=5; no1++) {
				if(no1%2==0) {
					System.out.print("0 ");
				}
				else
					System.out.print("1 ");
			}
			System.out.println();
			for(int no1=1; no1<=5; no1++) {
				if(no1%2==0) {
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
			
		}
	}

	private void demo3() {
		for(int no=1; no<=5; no++) {
			if(no%2==0) {
				System.out.print("0 ");
			}
			else
				System.out.print("1 ");
		}
	}

	private void demo2() {
		for(int row=1; row<=2; row++) {
			for(int no=1; no<=5; no++) {
				System.out.print(no+"\t");
			}
			System.out.println();
			for(int no=5; no>=1; no--) {
				System.out.print(no+"\t");
			}
			System.out.println();
		}
	}

	private void demo1() {
		int no=1;
		for(int row=1; row<=3; row++) {
			for(int col=1; col<=5; col++) {
				System.out.print(no+"\t ");
				no++;
			}
			System.out.println();
		}
	}

}
