package loops;

public class DivisorOf100OnlyPrimeNo {

	public static void main(String[] args) {
		int no=100;
		int div=2;
		while(div<=no) {
			if(no%div==0) {
					find_prime(div);
				
			}
			div++;
		}

	}

	private static void find_prime(int no) {
		int div=2;
		boolean prime=true;
		while(div<=no/2) {
			if(no%div==0) {
				prime=false;
				break;
			}
			div++;
		}
		if(prime==true) {
			System.out.print(no+" ");
		}
	}



}
