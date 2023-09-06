package SortingProgram;

public class BubbleSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSortingDemo sd = new BubbleSortingDemo();
		//sd.ascending_order();
		//sd.decending_order();
		sd.unique_number();
		//sd.in_bw_numbers15below_and_above();
	}
	private void in_bw_numbers15below_and_above() {
		int a[] = {22,53,2,4,6,11,15,14,8,9,20,44};
		for(int j=0; j<a.length; j++) {
		int no =a[j];
		for(int i=1; i<a.length; i++)
		{
			if(a[j]>a[i]) {
				int tem = a[i];
				a[i]=no;
				no=tem;
			}	
		}
		System.out.println(a[j]);
		}	
	}
	private void unique_number() {
		//int a[]= {10,10,10,20,30,30,40,50,50,50,60,70,70,80,90,100};
		/*int a[]= {2,2,4,5,8,8,8,10,10,12};
		for(int j=0; j<a.length;j++) {
			int no = a[j];
		if(no=='*')
			continue;
		for(int i=j+1; i<a.length; i++)
		{
			if(no==a[i]) {
				
				a[i]='*';
			}	
		}
		System.out.println(no);
		}*/
		int []ar= {2,2,4,5,8,8,8,10,10,12};
		int unique =1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
					{
				ar[unique]=ar[i+1];
				unique++;
					}	
		}
		for(int i=0;i<unique;i++)
		{
			System.out.println(ar[i]);
		}
		
	}
	private void decending_order() {
		int[] ar = {100,90,80,70};
		for(int j=1; j<=ar.length; j++)
		{
		for(int i=0; i<ar.length-j; i++)
		{
			if(ar[i]>ar[i+1])
			{
				int temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1]=temp;
			}
		}
		System.out.println(ar[ar.length-j]);
		}	
	}
	private void ascending_order() {
		int[] ar = {100,90,80,70};
		for(int j=1; j<=ar.length; j++)
		{
		for(int i=0; i<ar.length-j; i++)
		{
			if(ar[i]<ar[i+1])
			{
				int temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1]=temp;
			}		
		}
		System.out.println(ar[ar.length-j]);
		
		}
	}
}
