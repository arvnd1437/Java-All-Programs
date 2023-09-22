package Workout;

public class CompilerForWorkouts {

	public static void main(String[] args) {
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
}
