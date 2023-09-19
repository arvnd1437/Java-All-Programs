package loops;

public class DivisorOf100OnlyPrimeNo {

	public static void main(String[] args) {
		DivisorOf100OnlyPrimeNo pn=new DivisorOf100OnlyPrimeNo();
		pn.findPrime(100);
		

	}

	private void findPrime(int no) {
		int div=2;
		while(div<=no/2) {
			if(no%div==0) {
				
				System.out.println(div+" prime No");
			}
			div++;
		}
	}

}
