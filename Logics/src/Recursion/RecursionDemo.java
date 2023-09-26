package Recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		RecursionDemo rd = new RecursionDemo();
		//rd.demo1(1);
		//rd.demo2(1);
		//int no =rd.demo3(3);
		//System.out.println(no);
		
		 
		int reusult =rd.demo4(3);
		System.out.println(reusult);
		
		boolean primeno=rd.demo5(13,2);
		if(primeno==true) {
			System.out.println("Prime no");
		}
		else {
			System.out.println("Not Prime no");
		}
	}

	
	private boolean demo5(int no, int div) {
		if(no>div) {
			if(no%div==0)
				return false;
			else {
				div++;
				demo5(no,div);
			}
		}
		return true;
	}
	private int demo4(int no) {
		if(no==1)
		return no;
		else
			return no*demo4(no-1);
	}
	private int demo3(int no) {
		if(no==1)
			return no;
		else
			return no*demo3(no-1);	
	}
	private void demo2(int num) {
		System.out.println(num);
		num++;
		if(num<=5)
		demo2(num);
	}
	private void demo1(int no) {
		System.out.println(no);
		no++;
		demo1(no);
	}
}
