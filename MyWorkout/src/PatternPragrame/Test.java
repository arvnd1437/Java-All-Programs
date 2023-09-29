package PatternPragrame;

public class Test {

	public static void main(String[] args) {
		Test te=new Test();
//		te.demo1();
//		te.demo2();
//		te.demo3();
//		te.demo4();
//		te.demo5();


	}


	private void demo5() {
		for(int row=1;row<=2;row++) {
		for(int no=1;no<=5;no++) {
		if(no%2==0) {
			System.out.print("0"+" ");
		}
		else {
			System.out.print("1"+" ");
		}
		
	}
		System.out.println();
		for(int no=1;no<=5;no++) {
			if(no%2==0) {
				System.out.print("1"+" ");
			}
			else {
				System.out.print("0"+" ");
			}
		}
		System.out.println();
	
	}
	}

	private void demo4() {
		//o/p - 1 0 1 0 1
				for(int no=1;no<=5;no++) {
					if(no%2==0) {
						System.out.print("0"+" ");
					}
					else {
						System.out.print("1"+" ");
					}
				}
	}

	private void demo3() {
				//o/p - 1 2 3 4 5
				//      5 4 3 2 1
				//      1 2 3 4 5
				//      5 4 3 2 1
				for(int row=1;row<=2;row++) 
				{{
				for(int no=1;no<=5;no++)
				{
					System.out.print(no+" ");
					
				}
				System.out.println();
				for(int no=5;no>=1;no--)
				{
					System.out.print(no+" ");
					
				}
				System.out.println();
				}}
	}

	private void demo2() {
		//o/p -1 2 3 4 5
		//     6 7 8 9 10
		//     11 12 13 14 15
		for(int col=1;col<=15;col++) {
				
				System.out.print(col+" ");
				if(col%5==0) {
					System.out.println();
					}
			}
	}

	private void demo1() {
		// o/p - 1 1 1 1 1
		//       2 2 2 2 2
		
		for(int row=1;row<=2;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
}

