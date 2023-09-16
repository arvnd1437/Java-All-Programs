package loops;

//binary to decimal 

public class Splitnumber
{
	public static void main(String[]args)
	{
		Splitnumber sn = new Splitnumber();
		sn.split_digits(1011);}

	private void split_digits(int binary) {
		// TODO Auto-generated method stub
		int p = 0;
		int decimal=0;
		
		while(binary>0)
		{
			int rem = binary%10;
			int result = rem * find_power(2,p);
			p=p+1;
			decimal = decimal+result;
			//System.out.println(result);
			binary = binary/10;
		}
		System.out.println(decimal);
	
	
	}
	
	private int find_power(int base, int power) {
		// TODO Auto-generated method stub
		int no=1;
		while(power>0)
		{
			no = no*base;
			power=power-1;
			
		}
		return no;
	}
	
}