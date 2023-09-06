package Workout;

public class Power {
	public static void main(String[]args) {
		Power pr=new Power();
		pr.find_power(2,5);
		pr.find_power(2,6);
		pr.find_power(2,7);
		pr.find_power(2,8);
	}

	private void find_power(int base, int power) {
		// TODO Auto-generated method stub
		int num=1;
		while(power>0)
		{
			num=num*base;
			power=power-1;
		}
		System.out.println(num);
		
	}
	
	

}
