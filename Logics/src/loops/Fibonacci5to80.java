package loops;

public class Fibonacci5to80 {

	public static void main(String[] args) {
		Fibonacci5to80 fs=new Fibonacci5to80();
		fs.fibonacci(0,1);
	}

	private void fibonacci(int no1, int no2) {
		while(no1<=80) {
			
			if(no1>=5) {
				System.out.println(no1);
			}
			int no3=no1+no2;
			no1=no2;
			no2=no3;
		}
	}

}
