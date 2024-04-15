package loopsPattern;

public class PatternPrograme {
	public static void main(String[]args)
	{
		PatternPrograme pg=new PatternPrograme();
		pg.demo1();
//		pg.demo2();
//		pg.demo3();
//		pg.demo4();
	
	}

	private void demo4() {

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

	private void demo3() {
		 int no1=100,no2=60,div=2,gcd=0; int small=no1<no2?no1:no2;//Ternary Operator
		 
		 while(div<=small) 
		 { if(no1%div==0 && no2%div==0) 
		 {
			 gcd = div; 
			 } 
		 div++; }
		 System.out.println("GCD is:" + gcd);
	}

	private void demo2() {
		  int no1=100,no2=60,div=2; int small=no1<no2?no1:no2;//Ternary Operator
		  while(div<=small) { if(no1%div==0 && no2%div==0) { System.out.println(div); }
		  div++; }
		 
	}

	private void demo1() {
		  int no1=100,no2=60,div=2,small=0; 
		  if(no1<no2){
			  small=no1;
			  } 
		  else {
		  small=no2; 
		  }
		  while(div<=small) {
			  if(no1%div==0 && no2%div==0) {
		 
				  System.out.println(div);
				  } 
			  div++; 
			  }
		 
	}

}
