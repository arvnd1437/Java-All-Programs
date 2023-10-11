package Recursion;

public class RecursionForFactrial {
	

	public static void main(String[] args) {
		RecursionForFactrial rf=new RecursionForFactrial();
		System.out.println(rf.m(5));
		

	}

	private int m(int i) {
		if(i==1) {
		
		return 1;}
		
		else
			return (i*m(i-1));

	}

}
