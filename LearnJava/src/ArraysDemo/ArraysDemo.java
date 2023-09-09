package ArraysDemo;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		ArraysDemo ad=new ArraysDemo();
		ad.demo1();
		//ad.demo2();

	}

	private void demo2() {
		int x[]= {1,2,5,6,7,8,};
		int y[]= {1,2,3,5,4,3};
		System.out.println(Arrays.mismatch(x, y));
		System.out.println(Arrays.compare(x, y));//
		System.out.println(Arrays.equals(x, y));
	}

	private void demo1() {
		int[]a= {5,4,1,7,9,3,2};
		Arrays.sort(a);
		//Arrays.sort(a,2,7);
		System.out.println(Arrays.binarySearch(a, 9));
		System.out.println(Arrays.toString(a));
		
	}

}
