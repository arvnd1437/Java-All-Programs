package loops;

public class NeonNumber {

	public static void main(String[] args) {
		int no=9;
		int multi=no*no;
		int sum=0;
		while(multi>0) {
			int rem=multi%10;
			sum=sum+rem;
			multi=multi/10;
		}
		if(no==sum) {
			System.out.println(no+" is Neon Number");
		}
		else
			System.out.println(no+" is Neon Not Number");

	}

}
