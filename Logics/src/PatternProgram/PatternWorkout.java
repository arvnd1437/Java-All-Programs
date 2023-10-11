package PatternProgram;

public class PatternWorkout {

	public static void main(String[] args) {
		PatternWorkout pw=new PatternWorkout();
		pw.demo1();
		pw.demo2();
		pw.demo3();
		pw.demo4();
		pw.demo5();
		pw.demo6();
		pw.demo7();
		pw.demo8();
		pw.demo9();
		pw.demo10();
		pw.demo11();//check code
		pw.demo12();
		pw.demo13();
		pw.demo14();
		pw.demo15();
		pw.demo16();
		pw.demo17();
		pw.demo18();
		pw.demo19();
		pw.demo20();
		pw.demo21();
		

	}

	private void demo21() {
		for(int row=1; row<=4; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col-row+"\t");
			}
			System.out.println();
		}
	}

	private void demo20() {
		for(int row=1; row<=4; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col+row+"\t");
			}
			System.out.println();
		}
	}

	private void demo19() {
		for(int row=1; row<=4; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col*row+"\t");
			}
			System.out.println();
		}
		
	}

	private void demo18() {
		for(int no=1; no<=10; no+=2) {
			System.out.print(no+" ");
			if(no==9) {
				no=0;
			}
		}
	}

	private void demo17() {
		int no=5;
		for(int row=1; row<=4; row++) {
			for(int col=1; col<=4; col++) {
				System.out.print(no+" \t");
			}
			System.out.println();
			no--;
		}
	}

	private void demo16() {
		for(char row='A'; row<='D'; row++) {
			for(char col='A'; col<=row; col++) {
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
	}

	private void demo15() {
		for(int no=1; no<=10;no+=2) {
			System.out.print(no+" ");
		}
	}

	private void demo14() {
		int no2=5;boolean first=true;
		for(int no=1;no<=5;no++) {
			System.out.print(no*no2+" ");
			if(no==5 && first==true) {
				no2=4;
				no=0;
				first=false;
				System.out.println();
			}
		}
	}

	private void demo13() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(1);	
			}
			System.out.print(" ");
		}
	}

	private void demo12() {
		for(int row=1; row<=4;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*\t");
			}
			for(int no=row;no<=3;no++) {
				System.out.print(1+"\t");
			}
			System.out.println();
		}
		
	}

	private void demo11() {
		for(int row=1; row<=4;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*  ");
				
			}
			System.out.print(1);
			System.out.println();
		}
	}

	private void demo10() {
		char ch='A';
		for(int row=1; row<=4; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

	private void demo9() {
		int no=1;
		for(int row=1; row<=4; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

	private void demo8() {
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col+ " ");
			}
			System.out.println();
		}
	}

	private void demo7() {
		for(int row=1; row<=5; row++) {
			for(int col=row; col<=5; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void demo6() {
		for(int row=1; row<=5; row++) {
			for(int col=5; col>=row; col--) {
				System.out.print(col+" ");
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
