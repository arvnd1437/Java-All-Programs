package Workout;

import java.util.Scanner;

public class CompilerForWorkouts {

	public static void main(String[] args) {//642
		CompilerForWorkouts bd=new CompilerForWorkouts();
		bd.find_decimal(1011);
		
	}	

	private void find_decimal(int binary) {
		int decimal=0;int power=0;
		while(binary>0) {
			int rem=binary%10;
			
			decimal=rem*find_power(2,power);
			power++;
			binary=binary/10;
			
		}
		System.out.println(decimal);
	}

	private int find_power(int base, int power) {
		int no=1;
		while(power>0) {
			no=no*base;
			power--;
		}
		return no;
	}
	
}
