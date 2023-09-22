package loops;

public class DivisorOf100OnlyPrimeNo {

	public static void main(String[] args) {
		DivisorOf100OnlyPrimeNo pn=new DivisorOf100OnlyPrimeNo();
		int no=100;
		int div=2;
		while(div<=no/2) {
			if(no%div==0) {
				find_prime(div);
			}
			div++;
		}
		

	}

	private static void find_prime(int no) {
		boolean prime=true;
		
	}



}
