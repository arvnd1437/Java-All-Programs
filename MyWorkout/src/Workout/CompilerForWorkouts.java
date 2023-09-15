package Workout;

import java.util.Scanner;

public class CompilerForWorkouts {

	public static void main(String[] args) {//642
		CompilerForWorkouts bd=new CompilerForWorkouts();
		int no1=0;int no2=1;
		while(no1<=20) {
			System.out.print(no1+" ");
			no2=no1+no2;
			no1=no2-no1;
		}
		
		
	}
	
}
