package loopsPattern;

public class NestedLoop {

	public static void main(String[] args) {
		NestedLoop nl=new NestedLoop();
//		nl.demo1();
//		nl.demo2();
		nl.demo3();
	}

	private void demo3() {
		for (int row=1;row<=3;row++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void demo2() {
		{
			for(int no=1;no<=10;no+=2)
			{
				System.out.print(no+" ");
				if(no==9)
				{
					no=0;
				}
			}
		}
	}

	private void demo1() {
		for(int row=5;row>=2;row--)
		{
			for(int col=1;col<=4;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}
