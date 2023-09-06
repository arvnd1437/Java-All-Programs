package PatternPragrame;

public class Workout1 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		
		}
		
		System.out.println();
		
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
				
		}
		System.out.println();
		
		for(char row = 'A';row<='E';row++) {
			for(char col='A';col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
System.out.println();
		
		for(char row = 'E';row>='A';row--) {
			for(char col='A';col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		//for(char row='I';row>='A';row--) {
		//	for(char col='A';col<=row;col+=2) {
			//	System.out.print(col+" ");
			//}
			//System.out.println();
		//}
		
		
		int no=1;
		for(int row=1;row<=4;row++) {
			for(int col=4;col>=row;col--) {
				
				System.out.print(no+" ");
				no++;	
			}
			System.out.println();
			for(int space=1;space<=row;space++)
			{
				System.out.print("  ");
			}
			
		}




}}
