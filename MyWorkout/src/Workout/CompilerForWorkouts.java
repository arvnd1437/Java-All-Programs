package Workout;

import java.util.Scanner;

public class CompilerForWorkouts {

	public static void main(String[] args) {//642
		int no=100;
		int div=2;
		while(div<=no/2) {
			if(no%div==0) {
			find_prime(div);
			}
			div++;
		}
	}

	private static void find_prime(int no) {
		boolean prime=true;
		int div=2;
		while(div<=no/2) {
			if(no%div==0) {
				prime=false;
				break;	
			}
			div++;
		}	
		
		
	if(prime==true) 
		System.out.println(div);
	
	}
}
