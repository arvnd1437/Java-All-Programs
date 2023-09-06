package PatternPragrame;

public class Test2 {
	public static void main(String[] args) {
		//o/p - 1 2 3 4 5
		//      1 2 3 4
		//      1 2 3
		
		/*for(int no=1;no<=5;no++) {
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
		System.out.println();*/
		
		/*int col=5;
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
		col=col--;*/
		
		/*int col=5;
		while(col>=3) {
			for(int no=1;no<=col;no++) {
				System.out.print(no+" ");
			}
			System.out.println();
			col--;
		}*/
		/*int col=1;
		while(col<=5) {
		for(int no=5;no>=col;no--) {
			System.out.print(no);
		}
		System.out.println();
		col++;
		}*/
		
		/*for(int row=1;row<=4;row++) {
			for(int col=row;col<=4;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}*/
		
		/*for(int row=1;row<=4;row++) {
			for(int col=1;col<=row
					;col++) {
				System.out.print(col);
			}
			System.out.println();
		}*/
		
			/*int no=1;
			for(int row=1;row<=4;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(no+" ");no++;
				}
				System.out.println();
				
			}*/
		
		
		/*for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}*/
		
		/*for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("*"+" ");
			}
			for(int no=row;no<=5;no++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}*/
		
		/*for(int row=1;row<=5;row++) {
			for(int star=1;star<row;star++) {
				System.out.print("  ");
			}
			for(int no=5;no>=row;no--) {
				System.out.print(no+" ");
			}
			System.out.println();
		}*/
		/*for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}*/
		
		/*for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++){
				System.out.print("*"+" ");
			}
			for(int no=1;no<=row;no++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}*/
		
		
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
	

}
