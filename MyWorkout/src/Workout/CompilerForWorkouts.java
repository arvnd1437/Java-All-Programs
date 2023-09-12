package Workout;

import java.util.Scanner;

public class CompilerForWorkouts {

	public static void main(String[] args) {//642
		int no=153;int no2=no;
		int ams=0;int count=0;int rem=0;
		while(no>0) {
			rem=no%10;
			count++;
			ams=ams+(rem*rem*rem);
			no=no/10;
		}
	
		
		if(no2==ams) {
		System.out.println("ams");}
		else {
			System.out.println("not ams");}
	
	}
	
}
