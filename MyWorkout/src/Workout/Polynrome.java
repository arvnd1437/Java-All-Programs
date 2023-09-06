package Workout;

public class Polynrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=121,reverse=0,no2=no1;
		while(no1>0) {
			reverse=reverse*10 + no1%10;
			no1=no1/10;
		}
		if(reverse==no2) {
			System.out.println("Polynrome");
		}
		else {
			System.out.println("Not Polynrom");
		}
	}

}
