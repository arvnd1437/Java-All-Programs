package Workout;

public class Test {
	/*int x;
	static int y;
	{
		x=5;
		
	}
	static {
		y=6;
	}
	Test(int a){
		x=a;
	}*/
	
	public static void main(String[] args) {
		/*Test a3=new Test();
		Test a1=new Test(11);//constructor
		Test a2=new Test (12);//constructor
		System.out.println(Test.y);//static
		System.out.println(a1.x);//constructor
		System.out.println(a2.x);//constructor
		System.out.println(a3.x);*/
		
		
		int a[]= {1,2,3,4,5};
		int search=6;
		int min=0,max=a.length-1;
		while(min<=max) //0<=4
			{
			int mid=(min+max)/2;
			if(search==a[mid])
			{
				System.out.println(search +" is present in "+mid +" index ");
				break;
			}
			else if(search>a[mid])
			{
				min=mid+1;
			}
			else if(search<a[mid])
			{
				max=mid-1;
			}
			if(min>max)
			{
				System.out.println("Search not found");
			}
				
			
		}
		
		
		
		
		
	
	

	}

}
