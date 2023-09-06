package Workout;

public class FibonacciPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FibonacciPrograme fp = new FibonacciPrograme();
		fp.find_fibonacci(0,1);//0,1,0+1=1,1+1=2,1+2=3,2+3=5,......this is fibonacci
	}                          //0,1,1,2,3,5,...

	private void find_fibonacci(int firstno, int secondno) {
		// TODO Auto-generated method stub
		while(firstno<=1000)
		{
		System.out.print(firstno+" ");
		int thirdno=firstno+secondno;
		firstno=secondno;
		secondno=thirdno;
		}
		
		
	}

}
