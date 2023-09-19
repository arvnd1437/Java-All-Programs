package loops;

public class PowerDemoFor3No {

	public static void main(String[] args) {
		int no=5;
		while(no>=3) {
			find_power(no,no-1);
			no--;
		}

	}

	private static void find_power(int base, int power) {
		int result=1;
		while(power>0) {
			result*=base;
			power--;
		}
		System.out.println(result);
	}

}
