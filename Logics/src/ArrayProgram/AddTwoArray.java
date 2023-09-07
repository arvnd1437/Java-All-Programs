package ArrayProgram;

public class AddTwoArray {

	public static void main(String[] args) {
		AddTwoArray at=new AddTwoArray();
		//at.add_two_array();
		//at.add_two_array_different_length();
		//at.concatenation_of_2_array();
		//at.add_next_numbers();
		//at.add_next_numbers1();
		at.add_next_numbers2();
		//gsdugjcbhgd
	}

	private void add_next_numbers2() {
		int a[]= {5,10,8,12};
		
		for(int i=0;i<a.length-1;i++) 
		{
			int small=a[i]<a[i+1]?a[i]:a[i+1];
			int big=a[i]>a[i+1]?a[i]:a[i+1];
		int no1=small;
		int no2=big;
		for(int val=no1;val<=no2;val++)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		}
		
		
	}

	private void add_next_numbers1() {
		int a[]= {5,10,15,20};
		for(int i=0;i<a.length-1;i++) 
		{
		int no1=a[i];
		int no2=a[i+1];
		for(int val=no1+1;val<no2;val++)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		}
		
	}

	private void add_next_numbers() //add present b/w adjacent element
	{
	int a[]= {5,10,15,20};
	for(int i=0;i<a.length-1;i++) 
	{
	int no1=a[i];
	int no2=a[i+1];
	for(int val=no1;val<=no2;val++)
	{
		System.out.print(val+" ");
	}
	System.out.println();
	}
	
		
	}

	private void concatenation_of_2_array() {
		int []a = {5,10,15};
		int[]b = {20,25,30};
		int[]result = new int[a.length+b.length];
		int j =0;
		for(int i=0; i<result.length; i++) {
			if(i<a.length) 
			{
			result[i]=a[i];
			}
			else
			{
				result[i]=b[j];
				j++;
			}
			System.out.println("Result  "+ result[i] );
		}
		
	}

	private void add_two_array_different_length() {
		int []a = {5,10,15,20};
		int[]b = {15,10,5};
		int big =a.length>b.length?a.length:b.length;
		int small =a.length<b.length?a.length:b.length;
		int []c = new int[big];
		
		for(int i=0;i<big;i++) 
		{
			if(i<small) {
			c[i]=a[i]+b[i];
			}
			else {
				c[i]=a[i];
			}
			System.out.println("Total: "+c[i]);
		}
		
		
	}

	private void add_two_array() //addition of two array
	{
		int []a = {5,10,15};
		int[]b = {15,10,5};
		int []c = new int[a.length];
		for(int i=0;i<a.length;i++) 
		{
			c[i]=a[i]+b[i];
			System.out.println("Total: "+c[i]);
		}
		
	}

}
