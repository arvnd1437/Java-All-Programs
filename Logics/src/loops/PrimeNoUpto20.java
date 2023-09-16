package loops;

public class PrimeNoUpto20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNoUpto20 pn20 = new PrimeNoUpto20();
		int no =2;
		while(no<=20)
		{
			pn20.find_primeno(no);
			no=no+1;
		}
		
		

	}

	private void find_primeno(int no) {
		// TODO Auto-generated method stub
		int div=2;
		int count=0;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.println(no+" "+"is Not Prime");
				count= count+1;
				break;
			}
			div=div+1;
		}
		if(count==0)
		{
			System.out.println(no + " "+" is Prime");
		}
		
	}

}
