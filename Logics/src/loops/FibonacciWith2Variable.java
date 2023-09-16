package loops;

public class FibonacciWith2Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciWith2Variable fibo = new FibonacciWith2Variable();
		fibo.print_fibo(0,1);

	}

	private void print_fibo(int first, int second) 
	{
		// TODO Auto-generated method stub

		while(first<=10)
		{
			System.out.print(first+" ");
			
			second = second+first;
			first = second-first;
			
		}

	}
}
