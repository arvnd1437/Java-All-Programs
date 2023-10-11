package Workout;

public class CompilerForWorkouts {

	public static void main(String[] args)
	{
		CompilerForWorkouts cw=new CompilerForWorkouts();
		cw.demo1(1);
		
	}

	private void demo1(int no) {
		System.out.println(no);
		no++;
		if(no<=10) {
		demo1(no);}
		
	}
}
