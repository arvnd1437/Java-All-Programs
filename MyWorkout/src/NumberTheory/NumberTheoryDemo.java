package NumberTheory;

public class NumberTheoryDemo {

		public static void main(String[] args) {
			NumberTheoryDemo nt = new NumberTheoryDemo();
			//nt.primrNo();//used in count
			//nt.primrNo1();//used in boolean
			//nt.perfectno();
			//nt.fibonacci_series();
			nt.amstrong_number();
			//nt.polindrome();
			//nt.factorial_programe();
			
			
	}

		private void factorial_programe() {
			//for loop
			int no=5;
			
			int fact=1;
			for(int i=1;i<=no;i++) {
				fact=fact*i;
			}
			System.out.println("factorial of given no is: "+fact);
			//while loop
		/*	int no1=5,fac=1;
			while(no1>0) {
				fac=fac*no1;
				no1--;
			}
			System.out.println("factorial of given no is: "+fac); */
			
		}

		private void polindrome() {
			int no1=131,rem=0,no2=no1;
			int reverse=0;
			while(no1>0)
			{
				rem=no1%10;
				reverse=(reverse*10)+rem;
				no1=no1/10;
			}
			if(no2==reverse) {
				System.out.println("Polindrome");
			}
			else
				System.out.println("Not polindrome");
		}

		private void amstrong_number() {
			int no1=153,no2=no1;			
			int ams=0;
			while(no1>0)
			{
				int rem = no1%10;
				ams=ams+(rem*rem*rem);
				no1=no1/10;
			}
			if(no2==ams) {
				System.out.println("It's Amstrong Number");
			}
			else
				System.out.println("It's Not Amstrong Number");
		}

		private void fibonacci_series() {
			int no1=0,no2=1,no3=0;
			for(int upto =0;upto<=10;upto++) {
				System.out.print(no1+" ");
				no3=no1+no2;
				no1=no2;
				no2=no3;
			}
		}

		private void perfectno() {
			int no =6;
			int div = 1;
			int perfect=0;
			while(div<=no/2) 
			{
				if(no%div==0)
				{
					perfect=perfect+div;
				}
				div++;
			}
				if (perfect==no) {
					System.out.println("Perfect no");
				}
				else 
					System.out.println("Not Perfect no");
				
		}

		private void primrNo1() {
			int no = 13;
			boolean count = false;
			int div=2;
			while(div<no/2)
			{
				
				if(no%div==0)
				{
					count =true;
					System.out.println("Not Prime no");
					break;	
				}
				else
					System.out.println("Prime no");
				break;
		}			
		}

		private void primrNo() {
			int no = 10;
			int count = 0;
			int div=2;
			while(div<no/2)
			{
				
				if(no%div==0)
				{
					count++;
					
				}
				div++;
			}
				
				if(count==0) 
				{
					System.out.println("Prime no");
				}
				else
					System.out.println("Not prime no");
			
			
		}

}


