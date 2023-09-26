package Workout;

public class CompilerForWorkouts {

	public static void main(String[] args)
	{
		for(int col=1; col<=5; col++) {
			for(int row=5; row>=col; row--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
}
