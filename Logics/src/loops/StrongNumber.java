package loops;

public class StrongNumber {

	public static void main(String[] args) {
		 int num=145;int fact=1;int sum=0;  
	      int   originalNum=num;
	        while (num>0)//145>0  14>0 1>0
	        {
	          int  rem=num%10;
	            //System.out.println("Reminder : "+rem);
	            fact=1;
	            for(int i=1;i<=rem;i++){
	                fact*=i;//fact=fact*i
	            }
	            //System.out.println("fact : "+fact);
	            sum+=fact;
	            num=num/10;
	        }
	        if (sum == originalNum) {
	            System.out.println(originalNum + " is STRONG NUMBER");
	        } else {
	            System.out.println(originalNum + " is not a STRONG NUMBER");
	        }

	}

}
