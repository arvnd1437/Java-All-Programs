package loops;

	
public class PrimeNumber {
	int prime_count=0;

public static void main(String[] args) {
	// find first 5 prime no
	PrimeNumber pn=new PrimeNumber();
	pn.find_primeno(2);


}

private void find_primeno(int no) 
{
	// TODO Auto-generated method stub
	int div=2;
	int count=0;

	
	while(div<=no/2)
	{
		if(no%div==0)
		{
		
//		System.out.println("Not Prime");
		count=count+1;
		break;
		
		}
	div=div+1;
	}

if(count==0)
{
System.out.println(no + "Prime");
prime_count=prime_count+1;
}
if(prime_count<5)
{
	no=no+1;
	find_primeno(no);


}
}
}

	
	
	
	
	
	
	
