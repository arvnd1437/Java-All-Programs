package Workout;



import java.util.Scanner;


public class CompilerForWorkouts {

	public static void main(String[] args) {
		int no=20;
		int div=2;
		int count=0;
		while(div<=no/2) {
			if(no%2==0) {
				//System.out.println(div);
				count++;
			}
			div++;}
			if(count==0) {
				System.out.println("prime");
			}
			else
				System.out.println("no prime");
		
//		System.out.println("Division count:"+count);	
}
}
