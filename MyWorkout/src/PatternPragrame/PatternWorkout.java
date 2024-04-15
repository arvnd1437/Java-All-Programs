package PatternPragrame;

public class PatternWorkout {

	public static void main(String[] args) {
		PatternWorkout pw=new PatternWorkout();
		pw.demo1();
		pw.demo2();
		pw.demo3();
		pw.demo4();
		
		}
		
		
	private void demo4() {
		int no=1;
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
			/*for(int space=4;space<=row;space++) {
				System.out.print(" ");
			}*/
		}
	}

	private void demo3() {
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
			for(int space=1;space<=row;space++) {
				System.out.print("  ");
			}
		}
	}

	private void demo2() {
		int no = 1;
		for(int row=1;row<=4;row++) {
			for(int col=4;col>=row;col--) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
			for(int sapce=1;sapce<=row;sapce++) {
				System.out.print("  ");
			}}
	}

	private void demo1() {
		int no=1;
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

}
