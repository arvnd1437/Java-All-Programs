package Workout;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1234555,count=0;
		while(no>0) {
			count=count+1;
			no=no/10;
		}
System.out.println(count);
	}

}
