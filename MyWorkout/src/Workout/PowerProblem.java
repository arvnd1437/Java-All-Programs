package Workout;

public class PowerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=2,power=5,result=1;
		while(power>0) {
			result=base*result;
			power=power-1;	
		}
		System.out.println(result);

	}

}
