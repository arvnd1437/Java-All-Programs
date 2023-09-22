package loops;

public class FactorialDemo {

	public static void main(String[] args) {
		FactorialDemo fd = new FactorialDemo();
		fd.demo1();
//		fd.demo2();
		

	}

	private void demo2() {
		int no=5;
		int fact=1;
		while(no>0) {
			fact*=no;
			no--;
		}
		System.out.println(fact);
	}

	private void demo1() {
		int no1=5;
		while(no1>0) {
			int no2=no1;
			int fact=1;
			while(no2>0) {
				fact*=no2;
				no2--;
			}
			System.out.println(fact);
			no1--;
		}
	}

}
