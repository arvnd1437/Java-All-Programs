package PatternPragrame;

public class AlphapetPattern {

	public static void main(String[] args) {
		AlphapetPattern ap = new AlphapetPattern();
		ap.patternA();
		ap.patetrnR();
		ap.patetrnA();
		ap.patetrnV();
		ap.patternI();
		ap.patternN();
		ap.patternD();
		ap.patternH();

	}

	private void patternH() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
			if(col==1||col==7||row==4)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	private void patternD() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
			if(col==2||row==1&&col<7||row==7&&col<7||col==7&&row>1&&row<7)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	private void patternN() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
			if(col==1||col==7||col==row)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	private void patternI() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
			if(col==4||row==1||row==7)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}	
		
	private void patetrnV() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=13;col++)
			{
				if(col==row||col+row==14)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}	
		

	private void patetrnA() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1&&row>1||col==7&&row>1||row==1&&col>1&&col<7||row==4)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	

	private void patetrnR() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1||row==1&&col<7||row<=4&&col==7&&row>1||row==4||row>=4&&col==row)
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		System.out.println();
		
	}

	private void patternA() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1&&row>1||col==7&&row>1||row==1&&col>1&&col<7||row==4)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
