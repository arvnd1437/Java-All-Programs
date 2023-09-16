package loops;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibo = new Fibonacci();
		fibo.print_fibo(0,1);

	}

	private void print_fibo(int first, int second) {
		// TODO Auto-generated method stub
		int count=1;
		while(count<=10)
		{
			System.out.print(first+" ");
			int third = first + second;
			first = second;
			second = third;
			count = count+1;
			
		}
		
		
		/*System.out.println(first);      thish programe to number of time so lets using loops
		int third = first + second;
		first = second;
		second = third;
		
		
		System.out.println(first);
		int third = first + second;
		first = second;
		second = third;
		
		
		System.out.println(first);
		int third = first + second;
		first = second;
		second = third;
		;*/
	}

}
