package PatternPragrame;

public class Test2 {
	public static void main(String[] args) {
		Test2 te=new Test2();
//		te.demo1();
//		te.demo2();
//		te.demo3();
//		te.demo4();
//		te.demo5();
//		te.demo6();
//		te.demo7();
//		te.demo8();
		te.demo9();
		te.demo10();
//		te.demo11();
//		te.demo12();
//		te.demo13();
	
	}


	private void demo13() {

		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++){
				System.out.print("*"+" ");
			}
			for(int no=1;no<=row;no++) {
				System.out.print(no);
			}
			System.out.println();
		}
		
	}

	private void demo12() {
		for(int row=1;row<=5;row++) {
		for(int col=1;col<=5-row;col++){
			System.out.print("*"+" ");
		}
		for(int no=1;no<=row;no++) {
			System.out.print(row+" ");
		}
		System.out.println();
	}
	}

	private void demo11() {
		for(int row=5;row>=1;row--) {
		for(int col=1;col<=row;col++){
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	}

	private void demo10() {
		for(int row=1;row<=5;row++) {
		for(int star=1;star<row;star++) {
			System.out.print("  ");
		}
		for(int no=5;no>=row;no--) {
			System.out.print(no+" ");
		}
		System.out.println();
	}
	}

	private void demo9() {
		for(int row=1;row<=5;row++) {
		for(int col=1;col<row;col++) {
			System.out.print("*"+" ");
		}
		for(int no=row;no<=5;no++) {
			System.out.print(1+" ");
		}
		System.out.println();
	}
	}

	private void demo8() {
		for(int row=1;row<=5;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	}

	private void demo7() {
		int no=1;
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(no+" ");no++;
			}
			System.out.println();
			
		}
	}

	private void demo6() {
		for(int row=1;row<=4;row++) {
		for(int col=1;col<=row
				;col++) {
			System.out.print(col);
		}
		System.out.println();
	}
	}

	private void demo5() {
		for(int row=1;row<=4;row++) {
		for(int col=row;col<=4;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	}

	private void demo4() {
		
		int col=1;
		while(col<=5) {
		for(int no=5;no>=col;no--) {
			System.out.print(no);
		}
		System.out.println();
		col++;
		}
	}

	private void demo3() {
		int col=5;
		while(col>=3) {
			for(int no=1;no<=col;no++) {
				System.out.print(no+" ");
			}
			System.out.println();
			col--;
		}
	}

	private void demo2() {
		
		int col=5;
		for(int no=1;no<=col;no++) {
			System.out.print(no+" ");
		}
		System.out.println();
		col=col--;
		for(int no=1;no<=col;no++) {
			System.out.print(no+" ");
		}
		System.out.println();
		col=col--;
		
		for(int no=1;no<=col;no++) {
			System.out.print(no+" ");
		}
		System.out.println();
		col=col--;
	}

	private void demo1() {
		//o/p - 1 2 3 4 5
				//      1 2 3 4
				//      1 2 3
				
				for(int no=1;no<=5;no++) {
					System.out.print(no+" ");
				}
				System.out.println();
				
				for(int no=1;no<=4;no++) {
					System.out.print(no+" ");
				}
				System.out.println();
				
				for(int no=1;no<=3;no++) {
					System.out.print(no+" ");
				}
				System.out.println();
	}
	

}
