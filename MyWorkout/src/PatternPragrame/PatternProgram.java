package PatternPragrame;

public class PatternProgram {

	public static void main(String[] args) {
		// o/p require - * * * * * * *
		//               * * * * * * *
		//               * * * * * * *
		/*for(int star=1;star<=7;star++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		for(int star=1;star<=7;star++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		for(int star=1;star<=7;star++) {
			System.out.print("*"+" ");
		}*/
		
		//this is repeated action so consider while loop
		
		/*int row=1;
		while(row<=3) {
		for(int star=1;star<=7;star++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		row++;
		}*/
		
		//nested loop-for loop method
		for(int row=1;row<=3;row++) {
		for(int star=1;star<=7;star++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		}
		
		

	}

}
