package ArrayProgram;

public class MyWorkOut {

	public static void main(String[] args) {
		MyWorkOut mw = new MyWorkOut();
		//mw.work1();
		//mw.work2();
		//mw.work3();
		//mw.work4();
		//mw.work5(new int[]{10,22,44,66});  
		mw.work6();
		
		

	}

	
		
	private void work6() {
		int a[]= {92,32,42,99,74,33};
		int high1=a[0]>a[1]?a[0]:a[1];
		int high2=a[0]<a[1]?a[0]:a[1];
		
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>high1) {
				high2=high1;
				high1=a[i];
			}
			else if(a[i]>high2) {
				high2=a[i];
			}

		}
		System.out.println(high1);
		System.out.println(high2);
		
	}



	private void work5(int a[]) {
		 
			for(int i=0;i<a.length;i++)  
			System.out.println(a[i]);  
		
	}

	private void work4() {
		int a[]= {100,24,22,33,44};
		int min = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(min>a[i]) {
				min=a[i];
				
			}
			
		}
		
		System.out.println(min);
		
	}

	private void work3() {
		int a[]= {1,2,3,4,5};
		for(int i:a) {
			System.out.println(i);
		}
		
	}

	private void work2() {
		int a[]= {1,2,3,4,5};
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

	private void work1() {
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	
		
	}

}
