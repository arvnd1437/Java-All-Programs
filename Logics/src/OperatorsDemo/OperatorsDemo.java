package OperatorsDemo;

public class OperatorsDemo {

	public static void main(String[] args) {
		OperatorsDemo od = new OperatorsDemo();
		//od.demo1();
		//od.demo2();
		//od.demo3();
		od.demo4();
		

	}

	private void demo4() {
		String s= "A5B4";
		for(int i=0; i<s.length()-1; i+=2) {
			char letter=s.charAt(i);
			char num=s.charAt(i+1);
			for(char ch='1'; ch<=num; ch++) {
				System.out.print(letter+" "
						+ "");
			}
			
		}
	}

	private void demo3() {
		String s="A5";
		char letter=s.charAt(0);
		char num=s.charAt(1);
		int no=(int)num-48;
		for(int i=1; i<=no; i++) {
			System.out.print(letter+" ");
		}
		
		
	}

	private void demo2() {//o/p req - AAAAA
		String s="A5";
		char letter=s.charAt(0);
		char num=s.charAt(1);
		
		for(int i='1'; i<=num; i++) {
			System.out.print(letter+" ");
		}
		
	}

	private void demo1() {
		System.out.println(5&3);
		System.out.println(5|3);
		System.out.println(16>>2);
		System.out.println(16<<3);
		System.out.println(~5);
	}

}
