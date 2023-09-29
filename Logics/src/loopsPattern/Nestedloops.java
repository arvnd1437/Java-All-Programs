package loopsPattern;

public class Nestedloops {

	public static void main(String[] args) {
		Nestedloops nl=new Nestedloops();
//		nl.demo1();
//		nl.demo2();
//		nl.demo3();
//		nl.demo4();
//		nl.demo5();
//		nl.demo6();
		nl.demo7();
		

	
	}

	private void demo7() {
		for(int row=1;row<=4;row++)
		{
			for(int col=1; col<=row; col++) 
			{
				System.out.print(col-row+" ");
			}
			System.out.println();
		}
	}

	private void demo6() {
		for(int row=1;row<=4;row++)
		{
			for(int col=1; col<=row; col++) 
			{
				System.out.print(col+row+" ");
			}
			System.out.println();
		}
	}

	private void demo5() {
		for(int row=1;row<=4;row++)
		{
			for(int col=1; col<=row; col++) 
			{
				System.out.print(col*row+" ");
			}
			System.out.println();
		}
	}

	private void demo4() {
		for(int row=1;row<=4;row++)
		{
			for(int col=1; col<=row; col++) 
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void demo3() {
		for (int row=1;row<=4;row++)
		{
			for(int col=row; col<=4;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
	}

	private void demo2() {
		for (int row=1;row<=4;row++)
		{
			for(int col=row; col<=4;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void demo1() {
		int col=1;
		while(col<=5)
		{
			for(int no=5;no>=col;no--)
			{
				System.out.print(no+" ");
			}
			System.out.println();
			col++;
		}
		
	}
}
