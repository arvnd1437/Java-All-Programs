package loops;

public class PatternPrograme {
	public static void main(String[]args)
	{
		/*
		 * int no1=100,no2=60,div=2,small=0; if(no1<no2) { small=no1; } else {
		 * small=no2; } while(div<=small) { if(no1%div==0 && no2%div==0) {
		 * System.out.println(div); } div++; }
		 */
		
		
		/**
		 * int no1=100,no2=60,div=2; int small=no1<no2?no1:no2;//Ternary Operator
		 * while(div<=small) { if(no1%div==0 && no2%div==0) { System.out.println(div); }
		 * div++; }
		 */
		 
		
		//Greatest Common Divisiors
		 /*int no1=100,no2=60,div=2,gcd=0; int small=no1<no2?no1:no2;//Ternary Operator
		 
		 while(div<=small) 
		 { if(no1%div==0 && no2%div==0) 
		 {
			 gcd = div; 
			 } 
		 div++; }
		 System.out.println("GCD is:" + gcd);*/
		
		int no1=13,no2=19,div=2,gcd=0; int small=no1<no2?no1:no2;//Ternary Operator
		 
		 while(div<=small) 
		 { if(no1%div==0 && no2%div==0) 
		 {
			 gcd = div; 
			 } 
		 div++; }
		 if(gcd!=0)
		 System.out.println("GCD is:" + gcd);
		 else
			 System.out.println("Not Common Divisors Found");
		 
		
	}

}
