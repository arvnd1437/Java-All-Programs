package loops;

public class AmstrongNO {

	public static void main(String[] args) {
		int no=153;
		AmstrongNO am=new AmstrongNO();
		int power=am.find_count_digit(no);
		am.take_each_digit(no,power);
	}

	
	private int find_count_digit(int no) {
		int count_digits=0;
		while(no>0) {
			no=no/10;
			count_digits=count_digits+1;
		}
		return count_digits;
	}
	
	private void take_each_digit(int no, int power) {
		while(no>0) {
			int rem=no%10;
			no=no/10;
		}
	}
	
	void find_power(int b,int p) {
		int no=1;
		while(p>0) {
			no=no*b;
			p=p-1;
			
		}
	
	if(no==no) {
		System.out.println("Ams");
	}
	else
	{
		System.out.println("not ams");
	}


}}
