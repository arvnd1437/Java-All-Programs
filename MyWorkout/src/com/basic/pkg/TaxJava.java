package com.basic.pkg;
public class TaxJava
{
	
	
	public static void main(String[] args) {
		
		TaxJava old = new TaxJava();
		old.old_tax(1000000);
		
		TaxJava pre = new TaxJava();
		pre.previous_tax(1000000);
		
		TaxJava rev = new TaxJava();
		rev.revised_tax(1000000);
				

	}



	private void old_tax(int amount) {
		double tax_amt_1 =0;
		if(amount<=250000)
		{
		if(amount<=250000)
		{
			tax_amt_1 =0;
		}
		else if(amount<=500000)
		{
			tax_amt_1=((amount-500000)*5/100);
		}
		else if (amount<=1000000)
		{
			tax_amt_1=(500000*5/100)+((amount-1000000)*20/100);
		}
		}
		
		else
		{
			tax_amt_1=(500000*5/100)+(1000000*20/100)+(((amount-1000000)*30/100));
		}
		
		
		System.out.println("Old Tax amount:"+tax_amt_1);
		
		
	}

	
	private void previous_tax(int amount) {
		
		double tax_amt_2 =0;
		if(amount<=250000)
		{
		if(amount<=250000)
		{
			tax_amt_2 =0;
		}
		else if(amount<=500000)
		{
			tax_amt_2=((amount-500000)*5/100);
		}
		else if (amount<=750000)
		{
			tax_amt_2=(500000*5/100)+((amount-750000)*10/100);
		}
		else if(amount<=1000000)
		{
			tax_amt_2=(500000*5/100)+(750000*10/100)+((amount-1000000)*15/100);
		}
		else if(amount<=1250000)
		{
			tax_amt_2=(500000*5/100)+(750000*10/100)+(1000000*15/100)+((amount-1250000)*20/100);
		}
		else if(amount<=1500000)
		{
			tax_amt_2=(500000*5/100)+(750000*10/100)+(1000000*15/100)+(1250000*20/100)+((amount-1500000)*25/100);
		}
		}
		else
		{
			tax_amt_2=(500000*5/100)+(750000*10/100)+(1000000*15/100)+(1250000*20/100)+(1500000*25/100)+((amount-1500000)*30/100);
		}
		
		System.out.println("Previous Tax Amount:"+tax_amt_2);
		
	
		
		
		
	}

	private void revised_tax(int amount) {
		double tax_amt_3 =0;
		if(amount<=250000)
		{
			
		if(amount<=250000)
		{
			tax_amt_3  =0;
		}
		else if(amount<=600000)
		{
			tax_amt_3 =((amount-300000)*5/100);
		}
		else if (amount<=900000)
		{
			tax_amt_3 =(600000*5/100)+(((amount-600000)*10/100));
		}
		else if(amount<=1200000)
		{
			tax_amt_3 =(600000*5/100)+(900000*10/100)+((amount-900000)*15/100);
		}
		else if(amount<=1500000)
		{
			tax_amt_3 =(600000*5/100)+(900000*10/100)+(1200000*15/100)+((amount-1200000)*20/100);
		}
		}
		else
		{
			tax_amt_3 =(600000*5/100)+(900000*10/100)+(1200000*15/100)+(1500000*20/100)+((amount-1500000)*30/100);
		}
		System.out.println("Revised Tax Amount:"+tax_amt_3 );
		
		
	}
	
	
	
	

}
