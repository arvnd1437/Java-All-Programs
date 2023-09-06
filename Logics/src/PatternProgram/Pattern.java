package PatternProgram;

public class Pattern {

	public static void main(String[] args) {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(row==1&&col<7&&col>1||col==7&&row>1||col==1&&row>1||row==4) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
		System.out.println();
		}
		System.out.println();
		
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=15;col++) {
				if(row+col==8||col-row==6||row==4&&col>3&&col<11) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
		System.out.println();
		}
		System.out.println();
		
		
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(row==1&&col==3||row==1&&col==5||col==2&&row==2||row==2&&col==4||row==2&&col==6||row==3&&col==5||row==3&&col==3||row==4&&col==4) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
		System.out.println();
		}
		System.out.println();
	
	for(int row=1;row<=7;row++) {
		for(int col=1;col<=7;col++) {
			if(row==1&&col==4||row==2&&col==3||row==2&&col==5||row==3&&col==2||row==3&&col==6||row==4&&col==3||row==4&&col==5||row==5&&col==4) {
				System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
	System.out.println();
	}
	System.out.println();
}


}
