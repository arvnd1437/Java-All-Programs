package Workout;

public class PowerProgram {

	public static void main(String[] args) {
		PowerProgram pg = new PowerProgram();
		pg.power_demo1(2,5);
		pg.power_demo1(5,5);
		pg.power_demo1(2,5);
		pg.power_demo1(10,5);
	}
	
	

	private void power_demo1(int base, int power) {
		int no=1;
		while(power>0) {
			no = base * no;
			power--;
		}
			System.out.println(no);
	}

	

}
