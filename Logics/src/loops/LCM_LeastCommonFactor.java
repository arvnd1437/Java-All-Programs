package loops;

public class LCM_LeastCommonFactor {

	public static void main(String[] args) {
		LCM_LeastCommonFactor lcm=new LCM_LeastCommonFactor();
		lcm.leastCommonFactor(3,9);
	}

	private void leastCommonFactor(int no1, int no2) {
		int big=no1<no2?no1:no2;
		while(true) {
			if(big%no1==0&&big%no2==0) {
				System.out.println(big);
				break;
			}
			big++;
		}
	}

}
