package Workout;

public class CompilerForWorkouts {

	public static void main(String[] args)
	{
		
		for(int row=1; row<=5; row++) {
			for(int col=1;col<row; col++) {
				System.out.print("* ");
				
			}
			
			for(int st=row;st<=5; st++) {
				System.out.print(1+" ");
				
			}
			System.out.println();
			
			
		}
	}
}
