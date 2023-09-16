package loops;

public class FindPowerGivenNo {

	public static void main(String[] args) {
		FindPowerGivenNo fp=new FindPowerGivenNo();
		
		int no=1;
		while(no<=5) {
			fp.findPower(no,no);
			no++;
		}

	}

	private void findPower(int base, int power) {
		int no=1;
		while(power>0) {
			no*=base;
			power--;
		}
		System.out.println(no);
	}

}
