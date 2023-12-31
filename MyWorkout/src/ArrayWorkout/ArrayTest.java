package ArrayWorkout;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		//at.test_1();
		//at.test_2();
		//at.test_3();
		//at.test_4();
		//at.test_5();
		//at.test_6();
		//at.test_7();//find most frequent element
		at.test_8();//find lowest frequent element
		
		
		
	}

	private void test_8() {
			int arr[] = { 1, 3, 2, 1, 2, 2, 3, 1 };
			int INT_MAX = 1000000000;
			int mincount = INT_MAX;
			int element_having_min_freq = -1;
			for (int i = 0; i < arr.length; i++) 
			{
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
				count++;
			}

			if (count < mincount) {
				mincount = count;
				element_having_min_freq = arr[i];
			}
			}
			System.out.println(element_having_min_freq );

	}
	

	private void test_7() {
		int a[]= {2,2,4,5,3,6,1,2,3,5,6,6,1,2};
		int maxCount=0;
		int maxFreq=0;
		for(int i=0; i<a.length; i++) {
			//System.out.print(a[i]+" ");
			int count=0;
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxFreq=a[i];
			}
		}
		System.out.println("Most frqent Element is: "+ maxFreq+ " - "+maxCount+" times");
		
	}

	private void test_6() {
		int a [] = {-12,110,-11,20,-270};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0&&i/2!=0) {
				count++;
				System.out.println(a[i]);
				
			}
		}
		System.out.println(count);
		
	}

	private void test_5() {
		int a [] = {12,110,11,20,270};
		int low1=Integer.MAX_VALUE,low2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<low1) {
				low2=low1;
				low1=a[i];
			}
			else if (a[i]<low2) {
				low2=a[i];
			}
		}
		System.out.println(low1);
		System.out.println(low2);
	}

	private void test_4() {
		int a [] = {120,110,96,20,270};
		int h1=a[0],h2=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>h1) {
				h2=h1;
				h1=a[i];
			}
			else if((a[i]>h2)) {
				h2=a[i];
			}
			
		}
		//System.out.println(h1);
		//System.out.println(h2);
		
		
	}

	private void test_3()//highest first & Second highest
	{
		int marks [] = {35,160,96,177,88};
		int high1st=marks[0],high2nd=marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]> high1st) {
				high2nd=high1st;
				high1st=marks [i];
			}
			else if (marks[i]> high2nd) {
				high2nd=marks[i];
			}
		}
		System.out.println(high1st);
		System.out.println(high2nd);
	}

	private void test_2() //>96 mark & 100 mark count
	{
		int marks [] = {35,99,96,100,88};
		int count=0;
		for(int i=0;i<marks.length;i++) {
			//if(marks[i]>96) {
				//count+=1;
				
				
		//	}
			
			if(marks[i]==100) {
				count+=1;
				
			//}
			
			
		}
		
		}
		//System.out.println(count);
		System.out.println(count);
	}

	private void test_1() //total,high,low
	{
		int marks [] = {35,67,39,47,88};
		int total=0,high=0,low=100;
		for(int i=0;i<marks.length;i++)
		{
		total+=marks[i];
		if(marks[i]>high)
		{
			high = marks[i];
		}
		else if(marks[i]<low) {
			low=marks[i];
		}
			
		}
		System.out.println(total);
		System.out.println(high);
		System.out.println(low);
	}

}
