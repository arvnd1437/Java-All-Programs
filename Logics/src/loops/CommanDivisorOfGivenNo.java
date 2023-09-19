package loops;

public class CommanDivisorOfGivenNo {

	public static void main(String[] args) {
		CommanDivisorOfGivenNo cd=new CommanDivisorOfGivenNo();
		cd.common_div(100,60);

	}

	private void common_div(int no1, int no2) {
		int small=no1<no2?no1:no2;
		int div=2;
		while(div<=small/2) {
			if(no1%div==0&&no2%div==0) {
				System.out.println(div);
			}
			div++;
			
		}
	}

}
