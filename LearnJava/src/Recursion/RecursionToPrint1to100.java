package Recursion;

public class RecursionToPrint1to100 {
	void m(int i) {
		System.out.println(i);
		i++;
		if(i<=100) {
			m(i);
		}
	}
	
	public static void main(String [] args) {
		RecursionToPrint1to100 re=new RecursionToPrint1to100();
		re.m(1);
		
	}

}
